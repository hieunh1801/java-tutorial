package com.hieunh.baseproject.controller;

import com.hieunh.baseproject.exception.ResourceNotFoundException;
import com.hieunh.baseproject.model.Note;
import com.hieunh.baseproject.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Integer id, @RequestBody Note mNote) {
        Note note = noteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));
        note.setTitle(mNote.getTitle());
        note.setContent(mNote.getContent());
        return noteRepository.save(note);
    }

    @DeleteMapping("/notes/{id}")
    public Note deleteNote(@PathVariable(value = "id") Integer id) {
        Note note = noteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));
        noteRepository.delete(note);
        return note;
    }
}
