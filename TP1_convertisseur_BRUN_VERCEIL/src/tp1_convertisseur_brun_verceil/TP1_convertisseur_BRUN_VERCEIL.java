/*
BRUN VERCEIL FGE2 TDC
TP1 convertisseur
08/10/21
*/
package tp1_convertisseur_brun_verceil;

import java.util.Scanner;

/*
 * @author Mathilde
*/


public class TP1_convertisseur_BRUN_VERCEIL {

    /**
     * @param tCelcius
     * @return 
     */
    
    // définition des fonctions de convertions
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
        
        // Initialisation des variables
        double valeur = 0.0;
        int conv = 0;
        double answ = 0.0;
        Scanner sc = new Scanner(System.in);
        
        
        // Affichage de la question, des différents choix possibles de conversion et récupération du choix de l'utilisateur
        System.out.println("Bonjour, saisissez une valeur : ");
        valeur = sc.nextDouble();
       
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"); 
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
        
        conv = sc.nextInt();
        
        // execution et affichage des converstions \\
        
        if (conv == 1) {
            answ = CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answ+" degrés Kelvin");
        }
       
        if (conv == 2) {
            answ = KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answ+" degrés Celcius");
        }
        
        if (conv == 3) {
            answ = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answ+" degrés Celcius");
        }
        
        if (conv == 4) {
            answ = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answ+" degrés Farenheit");
        }
        
        if (conv == 5) {
            answ = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answ+" degrés Farenheit");
        }
        
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