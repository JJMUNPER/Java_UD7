module es.juanjesusmunozperez.listamusica {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    exports es.juanjesusmunozperez.listamusica;
    opens es.juanjesusmunozperez.listamusica to java.xml.bind;
}
