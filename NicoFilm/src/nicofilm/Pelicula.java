/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicofilm;

/**
 *
 * @author HP Usuario
 */
public class Pelicula {
    private int idPelicula;
    private String nombrePelicula;
    private int fechaPelicula;
    private short puntaje;
    private String reseña;

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }
    private String generos; 

    public short getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(short puntaje) {
        this.puntaje = puntaje;
    }
    
    
    public int getIdPelicula(){
        return idPelicula;
    }
    
    public String getNombrePelicula(){
        return nombrePelicula;
    }
    
    public int getFechaPelicula(){
        return fechaPelicula;
    }
    
    public Pelicula(int idPelicula, String nombrePelicula, int fechaPelicula){
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaPelicula = fechaPelicula;
    }
}
