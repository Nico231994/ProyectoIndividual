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
public class Actor {
    private int idActor;
    private String nombreActor;
    
    public int getIdActor(){
        return idActor;
    }
    
    public String getNombreActor(){
        return nombreActor;
    }
    
    void Actor(int idActor, String nombnreActor){
        this.idActor = idActor;
        this.nombreActor = nombreActor;
    }
}
