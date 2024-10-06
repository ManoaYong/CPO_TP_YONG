/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_yong;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manoa
 */
public class TP1_stats_YONG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m ;
        int [] myArray = { 0, 0 , 0 , 0 , 0 , 0 } ;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Rentrer un entier ");
        m = sc.nextInt();
        for(int i = 0 ; i < m ; ++i){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(5);
            ++myArray[n];
            String toString = Arrays.toString(myArray);
            System.out.println(toString);
        }
        double cpt =0 ;
        for (int i = 0 ; i <= 5 ; ++i){
          System.out.println(myArray[i]);
          ++cpt;
        }
        //System.out.println("CPT : "+ cpt);
        for (int i =0 ; i <= 5 ; ++i){
            double tmpz = myArray[i] / cpt ;
            System.out.println((100 * tmpz) + "%");
        }
    }
    
}
