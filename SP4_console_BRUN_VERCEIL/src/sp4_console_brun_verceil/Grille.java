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
    
    Cellule [][] CellulesJeu;

   
    
    // Methodes \\
    
 // Constructeur "Grille"
    public Grille() {
        CellulesJeu = new Cellule [6][7];
        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<7; co++) {
                
                CellulesJeu[li][co] = new Cellule();
                
            }
        }
        
    }

    
//ajouterJetonDansColonne(Jeton, int)    
    public boolean ajouterJetonDansColonne(Jeton nouveauJetonColonne, int nouvelleColonne) {
        
        // Vérification que la colonne est pleine (on regarde la ligne la plus haute)
        if (colonneRemplie(nouvelleColonne) == true) {
            return (false);
        }
        // Test de chaque cellule de la collonne tant qu'on en trouve pas une vide
        else {
            int i = 0;
            while (CellulesJeu[i][nouvelleColonne].jetonCourant != null & i !=5 ) {
                i++;         
            }
        // On affecte le nouveaux jetons à la Cellule
            return (CellulesJeu[i][nouvelleColonne].affecterJeton(nouveauJetonColonne));
        }
    }
    
 // etreRemplie()  : on test toute les cases, si une case est vide : la grille n'est pas vide
    public boolean etreRemplie() {
 
        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<7; co++) {
                if (CellulesJeu[li][co].jetonCourant == null) {
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
                CellulesJeu[li][co].jetonCourant = null;

            }
        }
    }
    
// affiche GrilleSurConsole
    public void GrilleSurConsole() {
        for (int li = 5; li>=0; li-- ) {
            for (int co = 0; co<7; co++) {
                if (CellulesJeu[li][co].jetonCourant==null){
                    System.out.print("\u001B[0m X");
                }
                else {
                    String CouleurDuJeton = lireCouleurDuJeton(li,co);
                    if(CouleurDuJeton=="Rouge"){
                        System.out.print("\u001B[31m J");
                    }
                    else {
                        System.out.print("\u001B[33m J");
                    }
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
    
    
    
// celluleOccupee : test si la cellule est occupé   
    public boolean celluleOccupee(int li, int co) {
        
        if (CellulesJeu[li][co].jetonCourant != null){
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
        for (int li = 0; li<6; li++ ) {
            for (int co = 0; co<4; co++) {
                if (CellulesJeu[li][co].jetonCourant != null && CellulesJeu[li][co+1].jetonCourant != null && CellulesJeu[li][co+2].jetonCourant != null && CellulesJeu[li][co+3].jetonCourant != null){
                    if (lireCouleurDuJeton(li,co) == UnJoueur.Couleur & lireCouleurDuJeton(li,co+1) == UnJoueur.Couleur & lireCouleurDuJeton(li,co+2) == UnJoueur.Couleur & lireCouleurDuJeton(li,co+3) == UnJoueur.Couleur ){             
                        return true;
                    }                    
                }                
            }          
        }
           
    // Scan horizontal
        for (int li = 0; li<3; li++ ) {
            for (int co = 0; co<6; co++) {
                if(CellulesJeu[li][co].jetonCourant != null && CellulesJeu[li+1][co].jetonCourant != null && CellulesJeu[li+2][co].jetonCourant != null && CellulesJeu[li+3][co].jetonCourant != null){                    
                    if (lireCouleurDuJeton(li,co) == UnJoueur.Couleur & lireCouleurDuJeton(li+1,co) == UnJoueur.Couleur & lireCouleurDuJeton(li+2,co) == UnJoueur.Couleur & lireCouleurDuJeton(li+3,co) == UnJoueur.Couleur ){                
                        return true;
                    }
                }
            }       
        }
    // Scan diagonale montante
        for (int li = 0; li<3; li++ ) {
            for (int co = 0; co<4; co++) {
                if(CellulesJeu[li][co].jetonCourant != null && CellulesJeu[li+1][co+1].jetonCourant != null && CellulesJeu[li+2][co+2].jetonCourant != null && CellulesJeu[li+3][co+3].jetonCourant != null){              
                    if (lireCouleurDuJeton(li,co) == UnJoueur.Couleur & lireCouleurDuJeton(li+1,co+1) == UnJoueur.Couleur & lireCouleurDuJeton(li+2,co+2) == UnJoueur.Couleur & lireCouleurDuJeton(li+3,co+3) == UnJoueur.Couleur ){                
                        return true;
                    }
                }    
            }            
        }
    
    // Scan diagonale descendante
        for (int li = 3; li<6; li++ ) {
                for (int co = 0; co<4; co++) {
                    if(CellulesJeu[li][co].jetonCourant != null && CellulesJeu[li-1][co+1].jetonCourant != null && CellulesJeu[li-2][co+2].jetonCourant != null && CellulesJeu[li-3][co+3].jetonCourant != null) {
                        if (lireCouleurDuJeton(li,co) == UnJoueur.Couleur & lireCouleurDuJeton(li-1,co+1) == UnJoueur.Couleur & lireCouleurDuJeton(li-2,co+2) == UnJoueur.Couleur & lireCouleurDuJeton(li-3,co+3) == UnJoueur.Couleur ){
                            return true;
                        }
                    }
                }
            } 
        return false;
    }
    
// colonneRemplie
    public boolean colonneRemplie(int uneColonne) {
        if (celluleOccupee(5,uneColonne) == true) {   
            return true;
            
        }
        return false; 
    }
    
    /**
// PlacerTrouNoir
    public boolean placerTrouNoir(int ligne, int colonne){
        for(int i=0; i<5;i++){
            if(CellulesJeu[ligne][colonne].placerTrouNoir()==false){
                i--;
            }
        }
        return(true); 
    }
 
    /**
    
 // Tasser Grille
    public void tasserGrille(int colonneaTasser){
        if (supprimerJeton(int nombre1, int nombre2)==true){
            
        }
    }
    
    // SupprimerJeton
    public boolean supprimerJeton(int number1, int number2){
        
    }
    
    //Recuperer Jeton
    public boolean recupererJeton(int numLigne, int numColonne){
        Cellule refJeton = CellulesJeu[numLigne][numColonne];
        CellulesJeu[numLigne][numColonne]=null;
        return(jeton)
    } **/
}
 
