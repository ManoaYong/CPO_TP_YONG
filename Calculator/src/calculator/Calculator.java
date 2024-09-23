/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;
/**
 *
 * @author manoa
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Please enter the operator: ");
    System.out.println("1) add");
    System.out.println("2) substract");
    System.out.println("3) multiply");
    System.out.println("4) divide");
    System.out.println("5) modulo");
    
    int operateur;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Entrer un entier correspondant a un operateur");
    operateur = sc.nextInt();
    
    if (operateur < 1 || operateur > 5){
        System.out.println("L'operateur n'est pas defini, erreur");
        System.exit(0);
    }
    
    float operande1;
    System.out.println("Entrer une premiere valeur");
    operande1 = sc.nextFloat();
    System.out.println("Votre valeur est: " + operande1 );
    
    float operande2;
    System.out.println("Entrer une deuxieme valeur");
    operande2 = sc.nextFloat();
    System.out.println("Votre valeur est: " + operande2 );
    
    if (operateur == 1){
        System.out.println("Le resultat est: " + (operande1 + operande2));
    }
    if (operateur == 2){
        System.out.println("Le resultat est: " + (operande1 - operande2));
    }
    if (operateur == 3){
        System.out.println("Le resultat est: " + (operande1 * operande2));
    }
    if (operateur == 4){
        System.out.println("Le resultat est: " + (operande1 / operande2));
    }
    if (operateur ==5){
        System.out.println("Le resultat est: " + (operande1 % operande2));
    }
    
    }
    }
    

