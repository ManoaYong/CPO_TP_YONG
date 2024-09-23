/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_yong;

import java.util.Scanner;

/**
 *
 * @author manoa
 */
public class TP1_convertisseur_YONG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        int b;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Entrer une temperature ");
        a = sc.nextDouble();
        System.out.println("Votre valeur est: " + a);
        System.out.println("Saisissez la conversion que vous souhaitez effectuer: ");
        System.out.println("1) De celsius a kelvin");
        System.out.println("2) De kelvin a celsius");
        System.out.println("3) De Farenheit a celsius");
        System.out.println("4) De celsius a farenheit");
        System.out.println("5) De kelvin a farenheit");
        System.out.println("6) De farenheit a kevin");
        b = sc.nextInt();
        if (b==1){
            System.out.println(a + " degre celsius est egale a " + CelsiusVersKelvin(a) + "degre kelvin");
        }
        if (b == 2){
            System.out.println(a + " degre kelvin est egale a " + KelvinVersCelsius(a) + "degre celsius");
        }
        if (b == 3){
            System.out.println(a + " degre farenheit est egale a " + FarenheitVersCelsius(a) + "degre celsius");
        }
        if (b == 4 ){
            System.out.println(a + " degre celsius est egale a " + CelsiusVersFarenheit(a) + "degre farenheit");
        }
        if (b == 5){
            System.out.println(a + " degre kelvin est egale a " + KelvinVersFarenheit(a) + "degre farenheit");
        }
        if (b == 6){
            System.out.println(a + " degre farenheit est egale a " + FarenheitVersKelvin(a) + "degre kelvin");
        }
        
    }
    public static double CelsiusVersKelvin (double tCelsius){
        double tmp=tCelsius + 273.15 ;
        return tmp;
    }
    public static double KelvinVersCelsius(double tKelvin){
        double tmp=tKelvin-273.15;
        return tmp;
    }
    public static double FarenheitVersCelsius(double tFarenheit){
        double tmp = (tFarenheit - 32) /1.8;
        return tmp ;
    }
    public static double CelsiusVersFarenheit(double tCelsius){
        double tmp = tCelsius*1.8 + 32;
        return tmp;
    }
    public static double KelvinVersFarenheit(double tKelvin){
         double tmp = KelvinVersCelsius(tKelvin);
         tmp = CelsiusVersFarenheit(tmp);
         return tmp;
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        double tmp = FarenheitVersCelsius(tFarenheit);
        tmp = CelsiusVersKelvin(tmp);
        return tmp;
    }

}
