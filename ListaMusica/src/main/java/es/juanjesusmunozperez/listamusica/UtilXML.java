package es.juanjesusmunozperez.listamusica;

import java.io.File;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author usuario
 */
public class UtilXML {
    
    public static void guardarDatosXML(Stage stage, Canciones listaCancion){
        JAXBContext contexto;
            try {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Guardar ");
                File fileListaCancion = fileChooser.showSaveDialog(stage);
            
//            File fileListaLibros = new File("ListaLibros.xml");
                contexto = JAXBContext.newInstance(Canciones.class);
                Marshaller marshaller = contexto.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(listaCancion, System.out);
                marshaller.marshal(listaCancion, fileListaCancion);
            } catch (JAXBException ex) {
                System.out.println("Se ha producido un error");
                ex.printStackTrace();
                
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error al guardar los ficheros XML");
                alert.setContentText("Se ha producido un error al guardar el fichero XML");
                alert.showAndWait();
                
            }
    }
            
    public static Canciones importarDatosXML(Stage stage){
        JAXBContext contexto;          
            try {
                FileChooser fileChooser1 = new FileChooser();
                fileChooser1.setTitle("abrir en");
                File fileListaCancion = fileChooser1.showOpenDialog(stage);
                
                JAXBContext context = JAXBContext.newInstance(Canciones.class );
                Unmarshaller unmarshaller = context.createUnmarshaller();
                Canciones cancion = (Canciones)unmarshaller.unmarshal(fileListaCancion);
                //System.out.println(cancion.getTitulo());
               //System.out.println(cancion.getPaginas());

                return cancion;
                
            } catch (JAXBException ex) {
            // TODO Auto-generated catch block
                ex.printStackTrace();
                
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error al unir los ficheros XML");
                alert.setContentText("Error en la importacion del XML");
                alert.showAndWait();
                
                return null;
        }
            
    }
    
}
