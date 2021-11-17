/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class SP4_console_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Interface Utilisateur
        System.out.println("Bien le bonjour joueurs !\nVeuillez entrer le nom du premier joueur :");
        Scanner sc = new Scanner(System.in); 
        String nomJ1 = sc.next();
        System.out.println("Bien, merci à vous et bienvenue parmi nous "+nomJ1);
        System.out.println("A présent, veuillez entrer le nom du deuxième joueur :");
        String nomJ2 = sc.next();
        System.out.println("Parfait, heureux de vous rencontrer "+nomJ2);
        System.out.println("Le jeu va pouvoir commencer !\nBonne chance "+nomJ1+" et "+nomJ2+"\nQue le meilleur gagne !");
        
        // Création des 2 joueurs
        Joueur joueur1 = new Joueur(nomJ1);
        Joueur joueur2 = new Joueur(nomJ2);
        
        // Création de la partie
        Partie nouvellePartie = new Partie(joueur1,joueur2);
        
        // Attribution des couleurs aux joueurs
        nouvellePartie.attribuerCouleursAuxJoueurs();
        
        // Initialisation de la partie
        nouvellePartie.initialiserPartie();
        
        // Lancement de la partie
        nouvellePartie.debuterPartie();
        
    }
}
