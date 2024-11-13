/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author manoa
 */
public class Epee extends Arme{
    
    int indice ;
            
    public Epee(String nom, int niv_att, int indice) {
        super(nom, niv_att);
       
        this.indice = indice ;
    }
    
}
