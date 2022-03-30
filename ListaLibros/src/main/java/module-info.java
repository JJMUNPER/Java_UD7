module es.juanjesusmunozperez.listalibros {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    exports es.juanjesusmunozperez.listalibros;
    opens es.juanjesusmunozperez.listalibros to java.xml.bind;
}
