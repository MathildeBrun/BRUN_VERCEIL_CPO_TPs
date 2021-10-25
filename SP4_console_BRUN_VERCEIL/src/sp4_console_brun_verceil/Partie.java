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
    Grille grilleJeu = new Grille();
    
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
        
    }
    
    public void debuterPartie() {
        
    }
}



/*                  
// définition de la class "Voiture
 public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;

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
*/
    
