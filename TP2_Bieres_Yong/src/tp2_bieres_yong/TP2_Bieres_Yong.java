/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_yong;

/**
 *
 * @author manoa
 */
public class TP2_Bieres_Yong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 , "Dubuisson") ;
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false ;
        uneBiere.lireEtiquette();
        //La méthode nous renvoie bien la bonne ligne de code
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe" , 6.6 , "Abbaye de Leffe") ;
        //secondeBiere.nom = "Leffe";
        //secondeBiere.degreAlcool = 6.6 ;
        //secondeBiere.brasserie = "Abbaye de Leffe" ;
        secondeBiere.lireEtiquette() ;
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("1664", 5.0 , "brass 1664");
        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", 5.0 , "brass Heineken");
        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Hinano" , 5.0 , "La Brasserie");
        cinquiemeBiere.lireEtiquette();
        
        uneBiere.Décapsuler();
        //System.out.println(uneBiere.ouverte);
        //La méthode change bel et bien la variable ouverte.
        
        System.out.println(uneBiere);
    }
    
}
