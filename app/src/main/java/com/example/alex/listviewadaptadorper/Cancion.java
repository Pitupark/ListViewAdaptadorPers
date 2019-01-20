package com.example.alex.listviewadaptadorper;

import java.io.Serializable;

public class Cancion implements Serializable{
    private String nombre;
    private String autor;
    private int codigo;
    private int foto;
    private int cancions;

    public Cancion(String nombre, String autor, int codigo, int foto, int cancions) {
        this.nombre = nombre;
        this.autor = autor;
        this.codigo = codigo;
        this.foto = foto;
        this.cancions = cancions;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCancions() {
        return cancions;
    }

    public void setCancions(int cancions) {
        this.cancions = cancions;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
