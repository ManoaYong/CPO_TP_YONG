/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author manoa
 */
public class Guerrier extends Personnage {
    boolean cheval ;

    public Guerrier(boolean cheval, String nom, double niv_vie) {
        super(nom, niv_vie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
}
