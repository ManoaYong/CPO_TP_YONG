/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author manoa
 */
public class Magicien extends Personnage{
    boolean confirme ;

    public Magicien(boolean confirme, String nom, double niv_vie) {
        super(nom, niv_vie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
}
