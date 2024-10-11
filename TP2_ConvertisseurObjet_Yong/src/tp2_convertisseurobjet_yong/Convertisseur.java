/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_yong;

/**
 *
 * @author manoa
 */
public class Convertisseur {
    int nbConversions ;
    public static double CelsiusVersKelvin (double tCelsius){
        double tmp = tCelsius + 273.15 ;
        return tmp;
    }
    public static double KelvinVersCelsius(double tKelvin){
        double tmp = tKelvin-273.15 ;
        return tmp ;
    }
    public static double FarenheitVersCelsius(double tFarenheit){
        double tmp = (tFarenheit - 32) /1.8 ;
        return tmp ;
    }
    public static double CelsiusVersFarenheit(double tCelsius){
        double tmp = tCelsius*1.8 + 32 ;
        return tmp;
    }
    public static double KelvinVersFarenheit(double tKelvin){
         double tmp = KelvinVersCelsius(tKelvin) ;
         tmp = CelsiusVersFarenheit(tmp) ;
         return tmp;
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        double tmp = FarenheitVersCelsius(tFarenheit) ;
        tmp = CelsiusVersKelvin(tmp) ;
        return tmp ;
    }
    public Convertisseur(){
        nbConversions = 0 ;
    }
    
    @Override
    public String toString(){
        return "nb de conversions"+ nbConversions;
    }
}
