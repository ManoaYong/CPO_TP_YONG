/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_yong;

/**
 *
 * @author manoa
 */
public class TP2_manip_Yong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(700) ;
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        //Uniquement deux assiettes sont crées 
        
        int tmp ;
        tmp = assiette2.nbCalories ;
        assiette2.nbCalories = assiette1.nbCalories ;
        assiette1.nbCalories = tmp ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        Moussaka[] tableau ;
        tableau = new Moussaka[10] ;
        for (int i =0 ; i < tableau.length ; i++){
            tableau[i] = new Moussaka(10000) ;
        }
    }
    
}
