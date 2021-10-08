/*
BRUN VERCEIL FGE2 TDC
TP1 convertisseur
08/10/21
 */
package tp1_convertisseur_brun_verceil;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */


public class TP1_convertisseur_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    
    public static double CelciusVersKelvin (double tCelcius) {
        return tCelcius += 274.15;
        }
    
    public static double KelvinVersCelcius (double tKelvin) {
        return tKelvin -= 274.15;
        }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        return tFarenheit = (tFarenheit - 32) / 1.8;
        }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        return tCelcius = (tCelcius*1.8) + 32;
        }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        return tKelvin = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        return tFarenheit = FarenheitVersCelcius (CelciusVersKelvin(tFarenheit));
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        

               
        double valeur = 0.0;
        Scanner sc = new Scanner(System.in); // commande de demande d'entrée pour l'utilsateurs 
        
        System.out.println("Bonjour, saisissez une valeur : ");
        valeur = sc.nextDouble(); // On récupère la première valeur dans notre première variable
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
        
    }
    
}

//1) De Celcius vers Kelvin 2) De Kelvin vers Celcius … 
//6) De Farenheit vers Kelvin 2 50 degré Kelvin est égal à -223.15 degrés Celcius