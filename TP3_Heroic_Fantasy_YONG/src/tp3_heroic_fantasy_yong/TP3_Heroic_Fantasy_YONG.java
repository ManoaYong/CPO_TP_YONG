/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_yong;

import java.util.ArrayList;

/**
 *
 * @author manoa
 */
public class TP3_Heroic_Fantasy_YONG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee une_epee = new Epee("Excalibur" , 7 , 5);
        Epee deux_epee = new Epee("Durandal" , 4 , 7);
        Baton un_baton = new Baton("Chêne" , 4 ,5) ;
        Baton deux_baton = new Baton("Charme" , 5 , 6) ;
        
        ArrayList<Arme> tab = new ArrayList<Arme>() ;
        tab.add(une_epee);
        tab.add(deux_epee) ;
        tab.add(un_baton) ;
        tab.add(deux_baton) ;
        System.out.println(tab) ;
        
    }
    
}
