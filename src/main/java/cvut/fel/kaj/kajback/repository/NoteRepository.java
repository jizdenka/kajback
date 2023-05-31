package cvut.fel.kaj.kajback.repository;

import cvut.fel.kaj.kajback.model.Note;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface NoteRepository extends JpaRepository<Note, Long>
{
    Optional<Note> findById(Long id);

    @Override
    List<Note> findAll();

    <S extends Note> boolean existsByHeaderAndTextAndTime(String header, String text, String time);

    <S extends Note, R> R findByHeaderAndTextAndTime(String header, String text, String time);
}
