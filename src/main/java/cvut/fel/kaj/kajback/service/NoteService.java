package cvut.fel.kaj.kajback.service;


import cvut.fel.kaj.kajback.model.Note;
import jakarta.transaction.Transactional;


import java.util.List;

public interface NoteService {
    List<Note> findAll();
    void pushAll(List<Note> list);
}
