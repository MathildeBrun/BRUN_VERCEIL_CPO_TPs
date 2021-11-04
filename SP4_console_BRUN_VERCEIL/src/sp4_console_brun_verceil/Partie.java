/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

import java.util.Random;

/**
 *
 * @author Mathilde
 */
public class Partie {
    // Création des attributs
    Joueur ListeJoueur [] = new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu[][] = new Grille[6][7] ;
    
    // Création du constructeur
    public Partie (Joueur joueur1, Joueur joueur2) {
        ListeJoueur[0] = joueur1;
        ListeJoueur[1] = joueur2;
    }
    
    // Création des méthodes
    public void attribuerCouleursAuxJoueurs() {
        Random generateurAleat = new Random();
        int num = generateurAleat.nextInt(1);
        if (num==1){
            ListeJoueur[1].Couleur = "Rouge";
        }
        else {
            ListeJoueur[1].Couleur = "Jaune";
        }
    }
    
    public void initialiserPartie() {
        for (int i =0; i<21; i++) {
            Jeton JetonJoueur1 = new Jeton("jaune");
            ListeJoueur[0].ajouterJeton(JetonJoueur1);
        }
        for (int j= 0; j<21;j++) {
            Jeton JetonJoueur2 = new Jeton("rouge");
            ListeJoueur[1].ajouterJeton(JetonJoueur2);
        }
        
    }
    
    public void debuterPartie() {
        
    }
}



    
