package es.juanjesusmunozperez.listalibros;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class ListaLibros {
    
    private ArrayList<Libro> listaLibros = new ArrayList();
    
    public ArrayList<Libro> getListaLibros(){
        return listaLibros;
    }
    
    public void setListaLibros(ArrayList<Libro> listaLibros){
        this.listaLibros = listaLibros;
    }
    
}
