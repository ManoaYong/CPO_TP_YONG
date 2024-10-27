/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_relation_1_yong;

/**
 *
 * @author manoa
 */
public class Voiture {
    String Modele ;
    String Marque ;
    int PuissanceCV ;
    String proprietaire = "NULL" ;

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
    }
    
    
    @Override
    public String toString(){
        return Modele + " " + Marque + " "+ PuissanceCV ;
    }
}
