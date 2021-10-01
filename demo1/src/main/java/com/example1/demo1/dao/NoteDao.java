package com.example1.demo1.dao;

import com.example1.demo1.model.Note;

import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteDao extends JpaRepository <Note,Long>{
     
}
