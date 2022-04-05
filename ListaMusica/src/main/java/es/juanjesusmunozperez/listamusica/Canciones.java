package es.juanjesusmunozperez.listamusica;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@XmlRootElement
public class Canciones {
    
    
    private ArrayList<Cancion> listascancion = new ArrayList();
    
    public ArrayList<Cancion> getListaCancion() {
        return listascancion;
    }
    
    @XmlElement(name = "cancion")
    public void setListaCancion(ArrayList<Cancion> listacancion) {
        this.listascancion = listascancion;
    }
    
    public void fusionarCanciones(Canciones cancionesNuevo){
     //librosOrigen.getListaLibros() <- librosNuevos.getListaCancion()
        this.getListaCancion().addAll(listascancion);
    //<- librosNuevos.getListaCancion()
        
    }
    
}
