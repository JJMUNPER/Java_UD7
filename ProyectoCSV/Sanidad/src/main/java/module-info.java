module es.juanjesusmunozperez.sanidad {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    exports es.juanjesusmunozperez.sanidad;
    opens es.juanjesusmunozperez.sanidad to java.xml.bind;
}
