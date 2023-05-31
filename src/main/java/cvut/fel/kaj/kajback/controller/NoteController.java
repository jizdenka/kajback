package cvut.fel.kaj.kajback.controller;


import cvut.fel.kaj.kajback.model.Note;
import cvut.fel.kaj.kajback.model.NoteDTO;
import cvut.fel.kaj.kajback.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/notes")
public class NoteController
{
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }


    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Note> getNotes()
    {
        return noteService.findAll();
    }

    @PostMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<String> saveNotes(@RequestBody List<NoteDTO> notes)
    {
        System.out.println("Got here");
        noteService.pushAll(notes);
        return new ResponseEntity<>("Task is created successfully", HttpStatus.CREATED);
    }


}

