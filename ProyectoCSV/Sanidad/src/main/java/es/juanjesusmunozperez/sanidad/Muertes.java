package es.juanjesusmunozperez.sanidad;


public class Muertes {
    
    private String Pais;
    private String Iniciales;
    private int Anno;
    private String CausasMuerte;
    
    public Muertes (String Pais){
        this.Pais = Pais.toUpperCase();
    }
    
    public Muertes (String Pais, String Causa){  //Causa en miniscula; autor
        this.Pais = Pais.toUpperCase();
        this.Iniciales = Iniciales;
    }
    
    public String getPais(){
        return Pais;
    }
    
    public void setPais(String Pais){
        this.Pais = Pais.toUpperCase();
    }
    
    public String getIniciales(){
        return Iniciales;
    }
    
    public void setIniciales (String Iniciales){
        this.Iniciales = Iniciales;
    }
    
    public int getAnno (){
        return Anno;
    }
    
    public void setAnno(int Anno){
        this.Anno = Anno;
    }
    
    public String CausasMuerte(){
        return CausasMuerte;
    }
    
    public void CausasMuerte(String CausasMuerte){
        this.CausasMuerte = CausasMuerte;
    }
    
    
    
}
