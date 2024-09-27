/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_yong;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manoa
 */
public class TP1_guessMyNumber_YONG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random generateurAleat = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("Choisissez une difficulte: Facile Moyen Difficile");
    String rep = sc.nextLine();
    if ("Facile".equals(rep)){
    int n = generateurAleat.nextInt(100); 
    System.out.println("Veuiller saisir un nombre entre 0 et 100: "); 
    int ent = sc.nextInt();
    int cpt = 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
     
    while (ent != n){   
    ent = sc.nextInt();
    cpt += 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
    }
    System.out.println("Vous avez gagne !!! En: " + cpt + " tentatives.");
    }
    if ("Moyen".equals(rep)){
    int n = generateurAleat.nextInt(1000);  
    System.out.println("Veuiller saisir un nombre entre 0 et 1 000: "); 
    int ent = sc.nextInt();
    int cpt = 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
     
    while (ent != n){   
    ent = sc.nextInt();
    cpt += 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
    }
    System.out.println("Vous avez gagne !!! En: " + cpt + " tentatives.");
    }
    if ("Difficile".equals(rep)){
    int n = generateurAleat.nextInt(10000);
    System.out.println("Veuiller saisir un nombre entre 0 et 10 000: "); 
    int ent = sc.nextInt();
    int cpt = 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
     
    while (ent != n){   
    ent = sc.nextInt();
    cpt += 1;
    if (ent < n){
        System.out.println("Trop petit");
    }
    if (ent > n){
        System.out.println("Trop grand");
    }
    }
    System.out.println("Vous avez gagne !!! En: " + cpt + " tentatives.");
    }
    }
    }
    
