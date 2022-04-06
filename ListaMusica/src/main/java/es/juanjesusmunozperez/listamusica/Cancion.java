package es.juanjesusmunozperez.listamusica;

/**
 *
 * @author usuario
 */
public class Cancion {
        
    private String titulo;
    private String autor;
    private String discografica;
    private String album;
    private float precio;
    private String fechaPublicacion;
    
    public Cancion() {        
    }
    
    public Cancion(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
    }
    
    public String getTitulo() {        
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getDiscografica() {
        return discografica;
    }
    
    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public void setAlbum(String album){
        this.album = album;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    @Override
    public String toString() {
        String r = "";
        r += "Titulo: " + titulo + "\n";
        r += "Autor: " + autor + "\n";
        return r;
    }
}
    

