/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author manoa
 */
public abstract class Personnage {
    String nom ;
    double niv_vie ;
    
    public Personnage( String nom , double niv_vie ){
        this.nom = nom ;
        this.niv_vie = niv_vie ;
    }
    
    Arme hand = null ;
    public void equiper(Arme unaarme){
        hand = unaarme ;
    }

    public Arme getHand() {
        return hand;
    }
    
    
    
    ArrayList<Arme> liste_arme = new ArrayList<Arme>() ;
    public boolean ajouter_arme(Arme une_arme) {
    if (liste_arme.size() < 5){
        liste_arme.add(une_arme) ;
        System.out.println("L'arme a ete ajoutee") ;
         return true ;
    }
    else{
        System.out.println("La liste des armes est pleine") ;
        return false ;
    }
    }
    
    public boolean equipement(String nom){
        
    }
    
    @Override
    public String toString (){
    return nom + " " + niv_vie ;
    }
}
