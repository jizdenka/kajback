package cvut.fel.kaj.kajback.service;

import cvut.fel.kaj.kajback.model.Note;
import cvut.fel.kaj.kajback.model.NoteDTO;
import cvut.fel.kaj.kajback.repository.NoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public void pushAll(List<NoteDTO> list) {
        for (NoteDTO notedto: list)
        {
            Note n = notedto.getNote();
            System.out.println(n.getText());
            System.out.println(n.getId());
            if(!noteRepository.existsByHeaderAndTextAndTime(n.getHeader(), n.getText(), n.getTime())) {
                noteRepository.save(n);
            }
            else
            {

                Note note = noteRepository.findByHeaderAndTextAndTime(n.getHeader(), n.getText(), n.getTime());
                if (notedto.isDeleted())
                {
                    noteRepository.delete(note);
                }
                else
                {
                    note.setUrgency(n.getUrgency());
                noteRepository.save(note);
            }}
       }
    }
}
