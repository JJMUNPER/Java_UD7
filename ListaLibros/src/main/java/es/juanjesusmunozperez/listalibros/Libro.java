/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.juanjesusmunozperez.listalibros;


public class Libro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private String fechaPublicacion;
    private int numPaginas;
    private float precio;
    
    public Libro(){
        
    }
    
    public Libro(String titulo){
        this.titulo = titulo.toUpperCase();
    }
    
    public Libro(String titulo, String autor){
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo.toUpperCase();
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public int getNumPaginas(){
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(){
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString(){
        String r = "";
        r += "Titulo: " + titulo + "\n";
        r += "Autor: " + autor;
        return r;
    }
}