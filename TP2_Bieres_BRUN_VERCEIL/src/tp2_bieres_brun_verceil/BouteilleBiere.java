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
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
    }
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; 
    }

}