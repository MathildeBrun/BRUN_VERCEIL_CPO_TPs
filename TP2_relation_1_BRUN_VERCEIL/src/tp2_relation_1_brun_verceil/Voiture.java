/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_brun_verceil;

/**
 *
 * @author thvel
 */

// définition de la class "Voiture
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
 // définition du constructeur 
    public Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
        Proprietaire = null;
        
    }
    
    
    
 // ReDéfinition de la façon dont affiche System.out.println()
    @Override // Ecrassement de la methode originel
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Marque + " " + Modele + " " + PuissanceCV + "CV" ; 
        return chaine_a_retourner ; 
    }    
}





