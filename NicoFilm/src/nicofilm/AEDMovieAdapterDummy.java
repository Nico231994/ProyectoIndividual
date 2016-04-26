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
public class AEDMovieAdapterDummy implements IAEDMovieAdapter{
    private String [][] peliculas;
    private String [][] actores;
    private String [][] peliculasActores;
        
    /**
     * Método que carga los datos <>peliculas</b>, <>actores</b> y 
     * <>peliculasActores</b> en las bariables miembro de la Clase 
     * AEDMovieAdapterDummy.
     */
    @Override
    public void cargarDatos() {
        obtenerActores();
        obtenerPeliculas();
        obtenerPeliculasActores();


        /*peliculas = new String[3][3];
        peliculas[0][0] = "1001";
        peliculas[0][1] = "DeadPool";
        peliculas[0][2] = "2016";
        peliculas[1][0] = "998";
        peliculas[1][1] = "50 shades of grey";
        peliculas[1][2] = "2015";
        peliculas[2][0] = "25";
        peliculas[2][1] = "Top Gun";
        peliculas[2][2] = "1986";*/

        /*actores = new String[4][2];
        actores[0][0] = "253";
        actores[0][1] = "Ryan Reynolds";
        actores[1][0] = "200";
        actores[1][1] = "Tom Cruise";
        actores[2][0] = "300";
        actores[2][1] = "Kelly McGillis";
        actores[3][0] = "450";
        actores[3][1] = "Dakota Johnson";*/

        /*peliculasActores = new String[4][2];
        peliculasActores[0][0] = "1001";
        peliculasActores[0][1] = "253";
        peliculasActores[1][0] = "998";
        peliculasActores[1][1] = "450";
        peliculasActores[2][0] = "25";
        peliculasActores[2][1] = "200";
        peliculasActores[3][0] = "25";
        peliculasActores[3][1] = "300";*/
    }

    /**
     * Obtiene de un archivo de texto csv el <b>código</b>, el <b>nombre</b> y el 
     * <b>año</b> de las pelúculas que contenga y almacena la información en una 
     * matriz.
     * @return Matriz de peliculas.
     */
    @Override
    public String[][] obtenerPeliculas() {
        String[] peliculas_arr = ManejadorArchivosGenerico.leerArchivo("src/UT2/TA4/Peliculas.csv", true);
        String[] pelicula_arr;
   
        peliculas = new String[peliculas_arr.length][3];
        for (int i = 0; i < peliculas_arr.length; i++) {
            pelicula_arr = peliculas_arr[i].split(",");
            peliculas[i] = pelicula_arr;       
        }
        return peliculas;
    }

    /**
     * Obtiene de un archivo de texto csv el <b>código</b> y el <b>nombre</b> 
     * de los actores que contenga y almacena la información en una matriz.
     * @return Matriz de actores.
     */
    @Override
    public String[][] obtenerActores() {
        String[] actores_arr = ManejadorArchivosGenerico.leerArchivo("src/UT2/TA4/Actores.csv", true);
        String[] actor_arr;
        
        actores = new String[actores_arr.length][2];  
        for (int i = 0; i < actores_arr.length; i++) {
            actor_arr  = actores_arr[i].split(",");      
                actores[i] = actor_arr;
        }
        return actores;
    }

    /**
     * Obtiene de un archivo de texto csv los <b>códigos</b> relacionado de la 
     * forma película - actor y almacena la información en una matriz.
     * @return Matriz de códigos relacionados.
     */
    @Override
    public String[][] obtenerPeliculasActores() {
        String[] pecliculasActores_arr = ManejadorArchivosGenerico.leerArchivo("src/UT2/TA4/PeliculasActores.csv", true);
        String[] pecliculaActor_arr;
        
        peliculasActores = new String[pecliculasActores_arr.length][2];
        for (int i = 0; i < pecliculasActores_arr.length; i++) {
            pecliculaActor_arr  = pecliculasActores_arr[i].split(",");
            peliculasActores[i] = pecliculaActor_arr;
        }    
        return peliculasActores;
    }
    
    /**
     * Obtiene la información de una determinada película a partir de su nombre
     * que se pasa como argumento del método, si no existe, devuelve "película
     * no existente.".
     * @param nombrePelicula Nombre de la película.
     * @return info de la película.
     */
    public String obtenerInfoPelicula(String nombrePelicula){
        for (int i = 0; i < peliculas.length; i++) {
            for (int j = 0; j < peliculas[i].length; j++) {
                if(peliculas[i][1].equals(nombrePelicula)){
                    String info = "Nombre: " + peliculas[i][1] + "\nId Pelicula: "
                            + peliculas[i][0] + "\nAño: " + peliculas[i][2];
                    return info;
                }
            }
        }
        return "Pelicula no existente.";
    }

    /**
     * Obtiene el nombre del actor a partir del id que se pasa como argumento del
     * método, si no se encuentra, devuelve "Sin actores.".
     * @param idActor id del actor.
     * @return info del actor.
     */
    public String getNombreActor(String idActor) {
        for (int i = 0; i < actores.length; i++) {
            for (int j = 0; j < actores[i].length; j++) {
                if(actores[i][0].equals(idActor)){
                    String info = "Actores: " + actores[i][1];
                    return info;
                }
            }
        }
        return "Sin actores.";
    }
    
    public static void main(String[] args) {
        AEDMovieAdapterDummy a = new AEDMovieAdapterDummy();
        a.cargarDatos();
        System.out.println(a.obtenerInfoPelicula("DeadPool"));
        System.out.println(a.getNombreActor("253"));
    }
}
