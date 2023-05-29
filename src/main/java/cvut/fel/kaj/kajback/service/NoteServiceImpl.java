package cvut.fel.kaj.kajback.service;

import cvut.fel.kaj.kajback.model.Note;
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
    public void pushAll(List<Note> list) {
        for (Note n: list)
        {
            if(noteRepository.existsById(n.getId())) continue;
            noteRepository.save(n);
        }
    }
}
