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
     * @param tCelcius
     * @param args the command line arguments
     * @return 
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
        int conv = 0;
        double answ = 0.0;
        Scanner sc = new Scanner(System.in); // commande de demande d'entrée pour l'utilsateurs 
        
        System.out.println("Bonjour, saisissez une valeur : ");
        valeur = sc.nextDouble(); // On récupère la première valeur dans notre première variable
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"); // Affichage de la question et des différents choix possibles de conversion
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
        conv = sc.nextInt(); // On récupère le numéro de la conversion a effectuer
        
        // execution et affichage pour la première conversion
        if (conv == 1) {
            answ = CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answ+" degrés Kelvin");
        }
        // execution et affichage pour la 2ème conversion
        if (conv == 2) {
            answ = KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answ+" degrés Celcius");
        }
        // execution et affichage pour la 3ème conversion
        if (conv == 3) {
            answ = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answ+" degrés Celcius");
        }
        // execution et affichage pour la 4ème conversion
        if (conv == 4) {
            answ = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answ+" degrés Farenheit");
        }
        // execution et affichage pour la 5ème conversion
        if (conv == 5) {
            answ = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answ+" degrés Farenheit");
        }
        // execution et affichage pour la 6ème conversion
        if (conv == 6) {
            answ = FarenheitVersKelvin(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answ+" degrés Kelvin");
        }
        // Bonus : affichage d'une message d'erreur si le numéro entré ne correspond à aucune conversion.
        else {
            System.out.println("Numéro de conversion invalide.");        
        }
        
        
    }
    
}