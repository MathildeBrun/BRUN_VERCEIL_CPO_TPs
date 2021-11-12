/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

/**
 *
 * @author Mathilde
 */

// Class "Cellule"

public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintégrateur;
    
 // Constructeur "Cellule"
    public Cellule() {
        jetonCourant = null;
        trouNoir = false;
        desintégrateur = false;
    }

// Methode affecterJeton

    public boolean affecterJeton(Jeton nouveauJetonCellule) { 
        if (jetonCourant == null) {
            jetonCourant = nouveauJetonCellule;
            return(true);
        }
        else {
            return(false);
        }
    }


// lireCouleurDuJeton()
    
    public String lireCouleurDuJeton() {

        return jetonCourant.lireCouleur();

    } 

}