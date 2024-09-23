/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_yong;

import java.util.Scanner;

/**
 *
 * @author manoa
 */

public class TP1_manipNombresInt_YONG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        int b;
        Scanner sc;
sc = new Scanner(System.in);
System.out.println("Entrer un entier ");
     a= sc.nextInt();
     System.out.println("Votre valeur est: "+ a);
     System.out.println("Entrer une variable");
     b = sc.nextInt();
     System.out.println("Votre valeur est: " + b);
     System.out.println("Le resultat de la somme des deux valeurs est: "+ (a+b));
     System.out.println("Le resultat de la difference des deux valeurs est: "+ (a-b));
     System.out.println("Le resultat du produit des deux valeurs est: "+ (a*b));
     System.out.println("Le resultat de la division des deux valeurs est: "+ (a/b));
     System.out.println("Le resultat de la somme des deux valeurs est: "+ (a%b));
     
    }
    
}
