package es.juanjesusmunozperez.sanidad;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;




public class Botons {
  
    public static void Pantalla(VBox root){
        
         TextField textfield = new TextField();
            textfield.setMinWidth(100);
            textfield.setMaxWidth(100);
        Button buttonver = new Button("Ver");
        TextArea textArea = new TextArea();
            textArea.setMaxWidth(200);
            textArea.setMinWidth(200);
        root.getChildren().addAll(textfield, buttonver, textArea);
        buttonver.setOnAction((t) -> {
            int nuevoAño;
            nuevoAño = Integer.valueOf(textfield.getText());
            UtilCSV mostrar = new UtilCSV();
            mostrar.LeerDatos(nuevoAño);
            textArea.setText(String.valueOf(mostrar.pais) + " : " + String.valueOf(mostrar.muerte));
        });
    }
    
}
