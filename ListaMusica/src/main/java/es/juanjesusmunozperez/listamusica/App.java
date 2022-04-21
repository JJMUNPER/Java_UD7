package es.juanjesusmunozperez.listamusica;

import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    int cancionActual = 0;

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        //Color de fondo del panel        
        root.setStyle("-fx-background-color: #DCDCDC"); 
       /*HBox root = new HBox();
       root.setAlignment(Pos.CENTER);
       root.setSpacing(10);*/
       
       //Tamaño ventana
       var scene = new Scene(root, 640, 480);
       stage.setScene(scene);
       stage.show();
       
        VBox VBox = new VBox();
        VBox.setAlignment(Pos.CENTER);
        //Color borde superior
        VBox.setBorder(new Border(new BorderStroke(Color.valueOf("#808080"),
        BorderStrokeStyle.SOLID,
        CornerRadii.EMPTY,
        new BorderWidths(15))));
        VBox.setSpacing(20);
        root.getChildren().add(VBox);
        
       
        
        
       
        Cancion cancion1 = new Cancion("Rock", "Clasic");
        //System.out.println(cancion1.getTitulo());
        cancion1.setTitulo("Starway to Heaven");
        cancion1.setAutor("Led Zeppelin");
        cancion1.setDiscografica("Atlantic Records");
        cancion1.setAlbum("Led Zeppelin IV");
        cancion1.setPrecio(1.50F);
        cancion1.setFechaPublicacion("08/10/1971");
        
        /*System.out.println(cancion1.getTitulo());
        System.out.println(cancion1.getAutor());
        System.out.println(cancion1.getDiscografica());
        System.out.println(cancion1.getAlbum());
        System.out.println(cancion1.getPrecio());
        System.out.println(cancion1.getFechaPublicacion());*/
        
        
        Cancion cancion2 = new Cancion("Rock", "Classic");
        cancion2.setTitulo("Time");
        cancion2.setAutor("Pink Floyd");
        cancion2.setDiscografica("Capitol Records");
        cancion2.setAlbum("The Dark Side of the Moon");
        cancion2.setPrecio(1.78F);
        cancion2.setFechaPublicacion("1973");
        
        /*System.out.println(cancion2.getTitulo());
        System.out.println(cancion2.getAutor());
        System.out.println(cancion2.getDiscografica());
        System.out.println(cancion2.getAlbum());
        System.out.println(cancion2.getPrecio());
        System.out.println(cancion2.getFechaPublicacion());*/
        
        
        Cancion cancion3 = new Cancion("Country", "Classic");
        cancion3.setTitulo("Ring of Fire");
        cancion3.setAutor("Johnny Cash");
        cancion3.setDiscografica("Columbia Nashville");
        cancion3.setAlbum("Love Is");
        cancion3.setPrecio((float)2.10);
        //cancion3.setPrecio(25.10f);
        //cancion3.setPrecio(25.10F);
        cancion3.setFechaPublicacion("1969");
        
        /*System.out.println(cancion3.getTitulo());
        System.out.println(cancion3.getAutor());
        System.out.println(cancion3.getDiscografica());
        System.out.println(cancion3.getAlbum());
        System.out.println(cancion3.getPrecio());
        System.out.println(cancion3.getFechaPublicacion());*/
        
        Canciones canciones = new Canciones();
        canciones.getListaCancion().add(cancion1);
        canciones.getListaCancion().add(cancion2);
        canciones.getListaCancion().add(cancion3); 
        
        
        Button buttonSelecFile = new Button ("Guardar XML");
        //buttonSelecFile.setGraphic(new ImageView(new Image("src/main/resources/save.png")));
        buttonSelecFile.setStyle("-fx-background-color: #808080");
        buttonSelecFile.setMinHeight(40);
        buttonSelecFile.setMinWidth(100);
        buttonSelecFile.setMaxHeight(40);
        buttonSelecFile.setMaxWidth(100);
        root.getChildren().add(buttonSelecFile);
        buttonSelecFile.setOnAction((t) ->{       
            UtilXML.guardarDatosXML(stage, canciones);
        
        });
        
        
        Button buttonSelectAbrir = new Button ("Importar XML");
        buttonSelectAbrir.setStyle("-fx-background-color: #808080");
            buttonSelectAbrir.setMinHeight(40);
            buttonSelectAbrir.setMinWidth(100);
            buttonSelectAbrir.setMaxHeight(40);
            buttonSelectAbrir.setMaxWidth(100);
        root.getChildren().add(buttonSelectAbrir);
        buttonSelectAbrir.setOnAction((t) ->{       
//            
            Canciones cancionesImport = UtilXML.importarDatosXML(stage);
            System.out.println(cancionesImport.getListaCancion().size());
            
            canciones.fusionarCanciones(cancionesImport);
           // canciones.fusionarCanciones(canciones, cancionesImport);
//            

        });
        
         //Diseño botones/Posicion botones superiores
        
        HBox paneScores = new HBox();
        paneScores.setAlignment(Pos.TOP_CENTER);
        paneScores.getChildren().add(buttonSelecFile);
        paneScores.getChildren().add(buttonSelectAbrir);
        paneScores.setSpacing(200);
        paneScores.setBorder(new Border(new BorderStroke(Color.valueOf("#696969"),
        BorderStrokeStyle.SOLID,
        CornerRadii.EMPTY,
        new BorderWidths(3))));
        VBox.getChildren().add(paneScores);
        
        // Labels para mostrar por pantalla.
        //
        //
        //
        Label label = new Label();
        Label label1 = new Label();        
        Label label2 = new Label();
        //Label label3 = new Label();
        
        /*root.getChildren().add(label);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);*/
        
        //Mostrar los Labels por pantalla
        
        root.getChildren().addAll(label, label1, label2);
        
        
        Button buttonAnterior = new Button ("Anterior");
        root.getChildren().add(buttonAnterior);
        buttonAnterior.setStyle("-fx-background-color: #808080");
            buttonAnterior.setMinHeight(40);
            buttonAnterior.setMinWidth(100);
            buttonAnterior.setMaxHeight(40);
            buttonAnterior.setMaxWidth(100);
        buttonAnterior.setOnAction((t) -> {
            cancionActual --;
            try {
                label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
                label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
                label2.setText("Discografica: " + canciones.getListaCancion().get(cancionActual).getDiscografica());
            }catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION); //Cambiar el tipo de Alert por Information
                alert.setTitle("Error; no existen datos anteriores");    //public static final Alert.AlertType.INFORMATION
                alert.setContentText("Ya estas en la primera cancion");
                ButtonType buttonTypeInicio = new ButtonType("Inicio");
                ButtonType buttonTypeCancelar = new ButtonType("Cerrar");
                alert.getButtonTypes().setAll(buttonTypeInicio, buttonTypeCancelar);
                Optional<ButtonType> result = alert.showAndWait();
                //alert.showAndWait();
                if (result.get() == buttonTypeInicio){
                    cancionActual = 0;
                    System.out.println("Cancion Actual" + cancionActual);
                    label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
                    label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
                    label2.setText("Discografica: " + canciones.getListaCancion().get(cancionActual).getDiscografica());
                }else if (result.get() == buttonTypeCancelar) {
                    cancionActual = canciones.getListaCancion().size();
                    System.out.println("objetoActual" + cancionActual);
                    label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
                    label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
                    label2.setText("Discografica: " + canciones.getListaCancion().get(cancionActual).getDiscografica());
                    
                } else {
                    System.exit(0);
                }
            }
        });
        
        Button buttonSiguiente = new Button ("Siguiente");
         buttonSiguiente.setStyle("-fx-background-color: #808080");
            buttonSiguiente.setMinHeight(40);
            buttonSiguiente.setMinWidth(100);
            buttonSiguiente.setMaxHeight(40);
            buttonSiguiente.setMaxWidth(100);
        root.getChildren().add(buttonSiguiente);
        buttonSiguiente.setOnAction((t) ->{
            cancionActual++;
            try {
            //areaText.setText(canciones.getListaCancion().get(cancionActual).toString());
            label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
            label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
            label2.setText("Discografica: " + canciones.getListaCancion().get(cancionActual).getDiscografica());
            //label3.setText(caniones.getListaCancion().get(cancionActual).getFechaPublicacion());

            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("No existen mas datos");
                alert.setContentText("No existen mas canciones que mirar");
                ButtonType buttonTypeInicio = new ButtonType("Inicio");
                ButtonType buttonTypeCancelar = new ButtonType("Cancelar");
                alert.getButtonTypes().setAll(buttonTypeInicio, buttonTypeCancelar);
                Optional<ButtonType> result = alert.showAndWait();
                //alert.showAndWait();
            }
        });
        
            label.setText("Titulo: " + canciones.getListaCancion().get(cancionActual).getTitulo());
            label1.setText("Autor: " + canciones.getListaCancion().get(cancionActual).getAutor());
            label2.setText("Discografica: " + canciones.getListaCancion().get(cancionActual).getDiscografica());
            
            //Interior y Labels
            
            VBox VBox2 = new VBox();
            VBox2.setMinHeight(300);
            VBox2.setMinWidth(400);
            VBox2.setMaxHeight(300);
            VBox2.setMaxWidth(400);
            VBox2.setAlignment(Pos.CENTER);
            VBox2.setSpacing(20);
            VBox2.setStyle("-fx-background-color: #F8F8FF");
            VBox2.setBorder(new Border(new BorderStroke(Color.valueOf("#808080"),
            BorderStrokeStyle.DASHED,   //Tambien me sirve SOLID
            CornerRadii.EMPTY,
            new BorderWidths(8))));
            VBox2.getChildren().add(label);
            VBox2.getChildren().add(label1);
            VBox2.getChildren().add(label2);
            //VBox2.getChildren().add(label3);
            //VBox2.getChildren().add(label4);
            VBox.getChildren().add(VBox2);
            
            // Botones inferiores
            
            HBox paneHBox = new HBox();
            paneHBox.setAlignment(Pos.BOTTOM_CENTER);
            paneHBox.getChildren().add(buttonAnterior);
            paneHBox.getChildren().add(buttonSiguiente);
            paneHBox.setSpacing(200);
            paneHBox.setBorder(new Border(new BorderStroke(Color.valueOf("#696969"),
            BorderStrokeStyle.SOLID,
            CornerRadii.EMPTY,
            new BorderWidths(3))));
            VBox.getChildren().add(paneHBox);
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}