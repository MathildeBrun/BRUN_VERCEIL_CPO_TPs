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
 
        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<7; co++) {
                if (CellulesJeu[li][co] == null) {
                    return (false);
                }
            }
        }
        return (true);
    }


// viderGrille : vide la grille
    public void viderGrille() {

        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<7; co++) {
                CellulesJeu[li][co] = null;

            }
        }
    }

// affiche GrilleSurConsole
    public void GrilleSurConsole() {
        String affichageConsole="";
        for (int i=0; i<7; i++) {
            for (int j=0; i<6; j++){
                if (CellulesJeu[i][j]==null){
                    affichageConsole = "X";
                }
                else {
                    String CouleurDuJeton = lireCouleurDuJeton(i,j);
                    if(CouleurDuJeton=="Rouge"){
                        affichageConsole="Rouge";
                    }
                    else {
                        affichageConsole="Jaune";
                    }
                }
                System.out.print(affichageConsole +"  ");
            }
            System.out.println("");
        }
    }
    
    
    
    
// celluleOccupee : test si la cellule est occupé
    
    public boolean celluleOccupee(int li, int co) {
        
        if (CellulesJeu[li][co] == null){
            return true;
        }
        else {
            return false;
        }
    }
    
// lireCouleurDuJeton
    
    public String lireCouleurDuJeton(int li, int co) {
        return CellulesJeu[li][co].lireCouleurDuJeton();
    }
    
// etreGagnantePourJoueur(Joueur)
    
    
    public boolean etreGagnantePourJoueur(Joueur UnJoueur){
        
        // Scan vertical    
        
        int nbJetonAligne = 0;
        
        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<7; co++) {
                
                
                
                if (lireCouleurDuJeton(li,co) == UnJoueur.Couleur ){
                
                    nbJetonAligne ++;
                    
                    if (nbJetonAligne == 4)
                        return true;
                    
                
                }
                else if (l = ) {
                    
                }
                else {
                    nbJetonAligne = 0; 
                }
                  
            }
            
        }
        
    }
    
    // Scan horizontale 
    
    // Scan diagonale droite 
    
    // Scan diagonale droite
    
    
}
