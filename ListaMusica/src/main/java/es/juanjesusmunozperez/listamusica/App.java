package es.juanjesusmunozperez.listamusica;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    int cancionActual = 0;

    @Override
    public void start(Stage stage) {
       HBox root = new HBox();
       root.setAlignment(Pos.CENTER);
       root.setSpacing(10);
       
       var scene = new Scene(root, 640, 480);
       stage.setScene(scene);
       stage.show();
       
        Cancion cancion1 = new Cancion("Ficheros en Java", "Luisa Pérez");
        System.out.println(cancion1.getTitulo());
        cancion1.setTitulo("Listas en Java");
        System.out.println(cancion1.getTitulo());
        
        Cancion cancion2 = new Cancion();
        
        Cancion cancion3 = new Cancion("XML en Java");
        cancion3.setTitulo("XML en Java 2");
        cancion3.setPrecio((float)25.10);
        cancion3.setPrecio(25.10f);
        cancion3.setPrecio(25.10F);
        
        Canciones canciones = new Canciones();
        canciones.getListaCancion().add(cancion1);
        canciones.getListaCancion().add(cancion2);
        canciones.getListaCancion().add(cancion3); 
        
        
        Button buttonSelecFile = new Button ("Guardar XML");
        root.getChildren().add(buttonSelecFile);
        buttonSelecFile.setOnAction((t) ->{       
            UtilXML.guardarDatosXML(stage, canciones);
        
        });
        
        
        Button buttonSelectAbrir = new Button ("Importar XML");
        root.getChildren().add(buttonSelectAbrir);
        buttonSelectAbrir.setOnAction((t) ->{       
//            
            Canciones cancionesImport = UtilXML.importarDatosXML(stage);
            System.out.println(cancionesImport.getListaCancion().size());
            
            canciones.fusionarCanciones(cancionesImport);
           // canciones.fusionarCanciones(canciones, cancionesImport);
//            

        });
        
        // Esto esta hecho a modo como ejemplo; Corregirlo para hacerlo de otra forma
        //
        //
        //
        Label label = new Label();
        Label label1 = new Label();        
        Label label2 = new Label();
        //Label label3 = new Label();
        
        root.getChildren().add(label);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        //root.getChildren().add(label3);
        
        
        Button buttonAnterior = new Button ("Anterior");
        root.getChildren().add(buttonAnterior);
        buttonAnterior.setOnAction((t) -> {
            cancionActual --;
            try {
                label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
                label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
                label2.setText("Codigo: " + canciones.getListaCancion().get(cancionActual).getISBN());
            }catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error; no existen mas XML");
                alert.setContentText("Ya estas en la primera cancion");
                alert.showAndWait();
            }
        });
        
        Button buttonSiguiente = new Button ("Siguiente");
        root.getChildren().add(buttonSiguiente);
        buttonSiguiente.setOnAction((t) ->{
            cancionActual++;
            try {
            //areaText.setText(canciones.getListaCancion().get(cancionActual).toString());
            label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
            label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
            label2.setText("Codigo: " + canciones.getListaCancion().get(cancionActual).getISBN());
            //label3.setText(caniones.getListaCancion().get(cancionActual).getFechaPublicacion());

            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error; no existen mas XML");
                alert.setContentText("No existen mas canciones que mirar");
                alert.showAndWait();
            }
        });
        
            label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
            label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
            label2.setText("Codigo: " + canciones.getListaCancion().get(cancionActual).getISBN());
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}