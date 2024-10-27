/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_relation_1_yong;

/**
 *
 * @author manoa
 */
public class Personne {
    String Nom ;
    String Prenom ;
    //int liste_voiture ;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public Personne(String Nom, String Prenom) {
        this.Nom = Nom ;
        this.Prenom = Prenom ;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0 ;
    }
    
    /**
     *
     * @param voiture_a_ajouter
     * @return
     */
    public boolean ajoutervoiture( Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.proprietaire == "NULL"){
            return false ;
        }
        if (nbVoitures  >= 3){
            return false ;
        }
        if (nbVoitures < 3 && nbVoitures >= 0){
            liste_voitures [nbVoitures]= voiture_a_ajouter ;
            nbVoitures += 1 ;
            voiture_a_ajouter.proprietaire = Nom ;
            return true ;
        }
        else{
            return false ;
        }
    }
    
    @Override
    public String toString(){
        return Nom + " " + Prenom ;
    }
    
}
