/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_convertisseurobjet_brun_verceil;

import java.util.Scanner;


/**
 *
 * @author Mathilde
 */
public class TP2_convertisseurObjet_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création de 2 objet de type Convertisseur et application de diverses convUtilisateurersions
        Convertisseur premieresConversions = new Convertisseur() ;
        premieresConversions.CelciusVersFarenheit(50);
        premieresConversions.KelvinVersCelcius(150);
        premieresConversions.CelciusVersFarenheit(124);
     
        Convertisseur deuxiemesConversions = new Convertisseur() ;
        deuxiemesConversions.KelvinVersFarenheit(1234);
        deuxiemesConversions.CelciusVersKelvin(93746);
        deuxiemesConversions.KelvinVersFarenheit(0);
        
        //Affichage du nombre de convUtilisateurersion effectuées par chaque objet.
        System.out.println(premieresConversions);
        System.out.println(deuxiemesConversions);
        
        // création du menu
        Scanner sc = new Scanner(System.in);
        Convertisseur troisiemesConversions = new Convertisseur();
        System.out.println("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();
              
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"); 
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
        
        int convUtilisateur = sc.nextInt();
        double answer;
        
        if (convUtilisateur == 1) {
            answer = troisiemesConversions.CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
        }
       
        if (convUtilisateur == 2) {
            answer = troisiemesConversions.KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
        }
        
        if (convUtilisateur == 3) {
            answer = troisiemesConversions.FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
        }
        
        if (convUtilisateur == 4) {
            answer = troisiemesConversions.CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
        }
        
        if (convUtilisateur == 5) {
            answer = troisiemesConversions.KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
        }
        
        if (convUtilisateur == 6) {
            answer = troisiemesConversions.FarenheitVersKelvin(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");
        }
    }  
}
