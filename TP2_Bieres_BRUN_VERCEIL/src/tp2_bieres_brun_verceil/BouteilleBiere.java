/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_bieres_brun_verceil;

/**
 *
 * @author Mathilde
 */

// définition de la class "BouteilleBiere"
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
// définition de l'action "lireEtiquette"
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
    }
    
// défintion de l'action décapsuler
    public boolean Décapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
        }
        else {
            System.out.println("erreur : bouteille déjà ouverte.");
            return false;
        }
    }
    
// définition du constructeur 
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
// ReDéfinition de la façon dont affiche System.out.println()
    @Override // Ecrassement de la methode originel
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ; 
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ; 
    }

}