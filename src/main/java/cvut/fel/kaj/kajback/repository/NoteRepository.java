package cvut.fel.kaj.kajback.repository;

import cvut.fel.kaj.kajback.model.Note;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long>
{
    Optional<Note> findById(Long id);

    @Override
    List<Note> findAll();
}
