package es.juanjesusmunozperez.listalibros;

import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@XmlRootElement 
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        var scene = new Scene(new StackPane(), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Libro libro1 = new Libro("Ficheros en Java");
        System.out.println(libro1.getTitulo());
        libro1.setTitulo("Listas en java");
        System.out.println(libro1.getTitulo());
        
        Libro libro2 = new Libro();
        Libro libro3 = new Libro("XML en java");
        libro3.setTitulo("XML en java 2");
        
        ListaLibros listaLibros = new ListaLibros();
        listaLibros.getListaLibros().add(libro1);
        listaLibros.getListaLibros().add(libro2);
        listaLibros.getListaLibros().add(libro3);
        
       /*
        
        //Mostrar el titulo del 3 libro
        System.out.println(listaLibros.get(2).getTitulo());
        
        //Eliminar el 2 libro
        listaLibros.remove(1);
        
        //Mostrar todos los titulo de libros de la lista
        for (int i=0; i<listaLibros.size(); i++ ){
            System.out.println(listaLibros.get(i).getTitulo());
        }
        
        for (int i=0; i<listaLibros.size(); i++ ){
            System.out.println(listaLibros.get(i));
        }*/
        JAXBContext contexto;
        try {
            File fileListaLibros = new File ("ListaLibros.xml");
            contexto = JAXBContext.newInstance(ListaLibros.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(libro1, System.out);
            marshaller.mar;
        } catch (JAXBException ex) {
            System.out.println("Se ha producido un error");
        }
        
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}