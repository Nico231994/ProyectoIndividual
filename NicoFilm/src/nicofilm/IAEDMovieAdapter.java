/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicofilm;

/**
 *
 * @author Josse
 */
public interface IAEDMovieAdapter {
    void cargarDatos();
    String [][] obtenerPeliculas();
    String [][] obtenerActores();
    String [][] obtenerPeliculasActores();
}
