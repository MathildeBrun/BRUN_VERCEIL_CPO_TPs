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
    Jeton jetonCourant = null;
    boolean trouNoir = false;
    boolean desintégrateur = false;
    
 // Constructeur "Cellule"
    public Cellule(Jeton unJetonCourant, boolean unTrouNoir, boolean unDesintegrateur) {
        jetonCourant = unJetonCourant;
        trouNoir = unTrouNoir;
        desintégrateur = unDesintegrateur;
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
}


    

