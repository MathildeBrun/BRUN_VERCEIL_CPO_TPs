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
// définition de la class Grille
public class Grille {
    
    Cellule [][] CellulesJeu = new Cellule [6][7];

    
    
    // Methodes \\
    
 // Constructeur "Cellule"
    public Grille(Cellule [][] uneCellulesJeu) {
        CellulesJeu = uneCellulesJeu;
    }

    
//ajouterJetonDansColonne(Jeton, int)
    
    public boolean ajouterJetonDansColonne(Jeton nouveauJetonColonne, int nouvelleColonne) {
        
        // Vérification que la colonne est pleine (on regarde la ligne la plus haute)
        if (CellulesJeu[0][nouvelleColonne] != null) {   
            return (false);
        }
        // Test de chaque cellule de la collonne tant qu'on en trouve pas une vide
        else {
            int i = 5;
            while (CellulesJeu[i][nouvelleColonne] != null) {
                i--;         
            }
        // On affecte le nouveaux jetons à la Cellule
            return (CellulesJeu[i][nouvelleColonne].affecterJeton(nouveauJetonColonne));
        }
    }
    
 // etreRemplie()  : on test toute les cases, si une case est vide : la grille n'est pas vide
    public boolean etreRemplie() {
 
        for (int l = 0; l<6; l++ ) {
            for (int c = 0; c<7; c++) {
                if (CellulesJeu[l][c] == null) {
                    return (false);
                }
            }
        }
        return (true);
    }


// viderGrille : vide la grille
    public void viderGrille() {

        for (int l = 0; l<6; l++ ) {
            for (int c = 0; c<7; c++) {
                CellulesJeu[l][c] = null;

            }
        }
    }

// afficheGrilleSurConsole
    
    
    
// celluleOccupee : test si la cellule est occupé
    
    public boolean celluleOccupee(int l, int c) {
        
        if (CellulesJeu[l][c] == null){
            return true;
        }
        else {
            return false;
        }
    }
    
// lireCouleurDuJeton
    
    public String lireCouleurDuJeton(int l, int c) {
        return CellulesJeu[l][c].jetonCourant.lireCouleur();
    }
    
// etreGagnantePourJoueur(Joueur)
    
    
  //  public 
    // Scan vertical
    
    
    
    // Scan horizontale 
    
    // Scan diagonale droite 
    
    // Scan diagonale droite
    
    
} 