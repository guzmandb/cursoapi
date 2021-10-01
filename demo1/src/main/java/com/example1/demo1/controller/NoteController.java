package com.example1.demo1.controller;

import com.example1.demo1.dto.NoteDto;
import com.example1.demo1.model.Note;
import com.example1.demo1.model.User;
import com.example1.demo1.service.impl.UserServiceImpl;
import com.example1.demo1.util.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value = "/notes/{id}", method = RequestMethod.POST)
        public void nota(@RequestBody NoteDto anotacion, @PathVariable(value = "id") long id){
        Note n = new Note();
        n.setCategoria(Categoria.musica);
        //n.setCategoria(Categoria.peliculas);
        //n.setCategoria(Categoria.universidad);
        n.setContenido(anotacion.getContenido());
        n.setTitulo(anotacion.getContenido());
        User karen = userService.findById(id);
        n.setUser(karen);
    }
    
}
