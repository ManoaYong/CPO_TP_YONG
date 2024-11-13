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
public class Baton extends Arme{
    
    int age ;
    public Baton(String nom, int niv_att, int age) {
        super(nom, niv_att);
        this.age = age ;
    }
    
}
