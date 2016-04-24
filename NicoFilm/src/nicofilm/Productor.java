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
public class Productor {
        private int idProductor;
    private String nombreProductor;
    
    public int getIdProductor(){
        return idProductor;
    }
    
    public String getNombreProductor(){
        return nombreProductor;
    }
    
    void Actor(int idProductor, String nombreProductor){
        this.idProductor = idProductor;
        this.nombreProductor = nombreProductor;
    }
}
