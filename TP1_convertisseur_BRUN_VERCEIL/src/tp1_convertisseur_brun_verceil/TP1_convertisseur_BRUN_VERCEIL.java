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
        

               
        double valeur = 0;
        
        Scanner sc = new Scanner(System.in); // commande de demande d'entrée pour l'utilsateurs 
        
        System.out.println("Bonjour, saisissez une valeur :\n lol");
        valeur = sc.nextDouble(); // On récupère la première valeur dans notre première variable
        
        
        
    }
    
}
