/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicofilm;

/**
 *
 * @author Nico
 */
public class Director {
        private int idDirector;
    private String nombreDirector;
    
    public int getIdDirector(){
        return idDirector;
    }
    
    public String getNombreDirector(){
        return nombreDirector;
    }
    
    void Actor(int idDirector, String nombreDirector){
        this.idDirector = idDirector;
        this.nombreDirector = nombreDirector;
    }
}
    

