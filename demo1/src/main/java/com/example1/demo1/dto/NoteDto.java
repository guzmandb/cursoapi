package com.example1.demo1.dto;

import com.example1.demo1.util.Categoria;

public class NoteDto {
    private String titulo;
    private String contenido;

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
