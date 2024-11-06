/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_yong;
/**
 *
 * @author manoa
 */
public abstract class Arme {
    String nom ;
    int niv_att ;
    
    public Arme(String nom , int niv_att){
        this.nom = nom ;
        if (niv_att > 100 || niv_att < 0){
            this.niv_att = 1 ;
        }
        else{
            this.niv_att = niv_att ;
        }
    }
    
    @Override
    public String toString(){
        return nom + " " + niv_att ;
    }
}
