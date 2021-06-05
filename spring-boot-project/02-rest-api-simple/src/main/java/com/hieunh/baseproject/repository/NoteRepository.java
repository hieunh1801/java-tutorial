package com.hieunh.baseproject.repository;

import com.hieunh.baseproject.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
