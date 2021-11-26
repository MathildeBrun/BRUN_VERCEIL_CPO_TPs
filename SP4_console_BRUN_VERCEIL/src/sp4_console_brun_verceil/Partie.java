/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

import java.util.Random;
import java.util.Scanner;

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
            ListeJoueur[0].Couleur = "Rouge";
            ListeJoueur[1].Couleur = "Jaune";
        }
        else {
            ListeJoueur[0].Couleur = "Jaune";
            ListeJoueur[1].Couleur = "Rouge";
        }
    }
    
    public void initialiserPartie() {
        attribuerCouleursAuxJoueurs();
        for (int i =0; i<21; i++) {
            Jeton JetonJoueur1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(JetonJoueur1);
        }
        for (int j= 0; j<21;j++) {
            Jeton JetonJoueur2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(JetonJoueur2);
        }
        int trouNoirPlaces = 0;
        while(trouNoirPlaces<3){
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if(grilleJeu.placerTrouNoir(ligne,colonne)==true){
                trouNoirPlaces++;
            }
        }
        int desintegrateurTNPlaces=0;
        while(desintegrateurTNPlaces<2){
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if(grilleJeu.placerTrouNoir(ligne,colonne)==true && grilleJeu.placerDesintegrateur(ligne,colonne)==true){
                desintegrateurTNPlaces++;
            }
        }
        int desintegrateurPlaces=0;        
        while(desintegrateurPlaces<3){
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if(grilleJeu.CellulesJeu[ligne][colonne].trouNoir == true && grilleJeu.placerDesintegrateur(ligne,colonne)==true){
                grilleJeu.CellulesJeu[ligne][colonne].desintegrateur=false;
            }
            else if(grilleJeu.CellulesJeu[ligne][colonne].trouNoir == false && grilleJeu.placerDesintegrateur(ligne,colonne)==true) {
                desintegrateurPlaces++;
            }
        }
    }
        
    public void debuterPartie() {
        
        do{
            int colonneJoueur;
            int ligneRecupJeton;
            int colonneRecupJeton;
                    
            // Affectation joueur
            if (joueurCourant==ListeJoueur[0]) {
                joueurCourant=ListeJoueur[1];
            }
            else {
                joueurCourant=ListeJoueur[0]; 
            }
            
            // Aficchage
            grilleJeu.GrilleSurConsole();
            
            
            // Demande action joueur
            System.out.println("A vous de jouer " + joueurCourant.Nom);
            System.out.println("Il vous reste" + joueurCourant.nombreDesintegrateurs + "désintégrateurs");
            System.out.println("Souhaitez-vous :\n1) Récuperer un jeton \n2) Placer un jeton \n3) Utiliser un désintégrateur");
            Scanner sc = new Scanner(System.in); 
            int choix = sc.nextInt();
            
            if (choix==1){                
                do{
                    do {
                        System.out.println("Quel jeton souhaitez-vous récuperer ?");
                        System.out.println("Entrer la ligne :");
                        ligneRecupJeton = sc.nextInt() -1;

                        System.out.println("Entrer la colonne :");
                        colonneRecupJeton = sc.nextInt() -1;


                        } while (colonneRecupJeton < 0 || colonneRecupJeton > 6 || ligneRecupJeton < 0 || ligneRecupJeton > 5);
                } while (grilleJeu.lireCouleurDuJeton(ligneRecupJeton,colonneRecupJeton)!= joueurCourant.Couleur);
                    
                Jeton jetonRecuperer = grilleJeu.recupererJeton(ligneRecupJeton, colonneRecupJeton);
                joueurCourant.ajouterJeton(jetonRecuperer);
                grilleJeu.tasserGrille(colonneRecupJeton);
                
                if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0])==true && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])==true){
                    System.out.println("Vous avez provoqué une faute de jeu, Vous avez perdu !");
                    if (joueurCourant==ListeJoueur[0]) {
                       joueurCourant=ListeJoueur[1];
                    }
                    else {
                        joueurCourant=ListeJoueur[0]; 
                    }
                    break;
                }
            }
            
            if (choix==2){
                System.out.println("Dans quelle colonne voulez-vous mettre un jeton ?");
                do {
                    // récup coup
                    colonneJoueur = sc.nextInt() - 1;

                    // message d'erreur 
                    if (grilleJeu.colonneRemplie(colonneJoueur) == true){
                        System.out.println("Cette colonne est déjà remplie, veuillez placer votre pion dans une autre colonne.");                    
                    }

                    } while (colonneJoueur < 0 || colonneJoueur >6 || grilleJeu.colonneRemplie(colonneJoueur) == true);

                // Ajout du jeton
                grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1], colonneJoueur);

                // le joueur à un jeton en moins
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = null;
                joueurCourant.nombreJetonsRestants--;
                
                // Le joueur récupère ou non un désintégrateur
                
                // On cherche la ligne pour avoir les coordonné
                int i=0;
                while (grilleJeu.CellulesJeu[i][colonneJoueur].jetonCourant != null & i !=5 ) {
                    i++;
                }
                // Si la cellule en question a un désintégrateur le joueur le récupère
                if(grilleJeu.CellulesJeu[i-1][colonneJoueur].desintegrateur==true){
                    System.out.println("\n" + joueurCourant.Nom + " a récupéré un désintégrateur\n");
                    joueurCourant.obtenirDesintegrateur();
                    grilleJeu.CellulesJeu[i-1][colonneJoueur].recupererDesintegrateur();
                }
            }
            
            if (choix==3){
                if(joueurCourant.nombreDesintegrateurs==0){
                    System.out.println("Vous n'avez pas de désintégrateur, vous ne pouvez donc pas en utiliser. Au tour du joueur suivant.");
                }
                else{
                    int ligneJoueur;
                    System.out.println("Dans quelle case souhaitez-vous utiliser le désintégrateur ?");
                    System.out.println("Entrez la ligne :");
                    ligneJoueur = sc.nextInt() - 1;
                    System.out.println("Entrez la colonne :");
                    colonneJoueur = sc.nextInt() - 1;
                    while(grilleJeu.CellulesJeu[ligneJoueur][colonneJoueur].jetonCourant==null || grilleJeu.CellulesJeu[ligneJoueur][colonneJoueur].lireCouleurDuJeton()==joueurCourant.Couleur){
                        System.out.println("Vous ne pouvez pas utiliser de désintégrateur ici, veuillez réessayer à un autre endroit.");
                        System.out.println("Entrez la ligne :");
                        ligneJoueur = sc.nextInt() - 1;
                        System.out.println("Entrez la colonne :");
                        colonneJoueur = sc.nextInt() - 1;
                    }
                    grilleJeu.supprimerJeton(ligneJoueur, colonneJoueur);
                    grilleJeu.tasserGrille(colonneJoueur);
                    joueurCourant.utiliserDesintegrateur();
                    if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0])==true && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])==true){
                        System.out.println("Vous avez provoqué une faute de jeu, Vous avez perdu !");
                        if (joueurCourant==ListeJoueur[0]) {
                            joueurCourant=ListeJoueur[1];
                        }
                        else {
                            joueurCourant=ListeJoueur[0]; 
                        }
                        break;
                    }
                }
            }
            
            
        } while(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0])!=true && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])!=true && grilleJeu.etreRemplie()!=true);
        
        System.out.println("Bravo ! Vous avez gagné " + joueurCourant.Nom);
        System.out.println("A bientôt pour un nouveau choc des titans...");
        
        
    }
 
}



    
