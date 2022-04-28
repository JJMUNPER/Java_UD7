package es.juanjesusmunozperez.sanidad;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Muerte {
    
    private ArrayList<Muertes> listaMuertes = new ArrayList();
    
    public ArrayList<Muertes> getListaMuertes(){
        return listaMuertes;
    }
    
    @XmlElement (name = "Muertes")
    public void setListaMuertes(ArrayList<Muertes> listaMuertes){
        this.listaMuertes = listaMuertes;
    }

}
