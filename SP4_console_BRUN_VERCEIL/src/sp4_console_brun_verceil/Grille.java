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
    
 // Constructeur "Cellule"
    public Grille(Cellule [][] uneCellulesJeu) {
        CellulesJeu = uneCellulesJeu;
    }

 // Methode ajouterJetonDansColonne(Jeton, int)
    
    public boolean ajouterJetonDansColonne(Jeton nouveauJetonColonne, int nouvelleColonne) {
        
        // Vérification que la colonne est vide (on regarde la ligne la plus haute)
        if (CellulesJeu[0][nouvelleColonne] != null) {   
            return (false);
        }
        // Test de chaque cellule de la collogne tant qu'on en trouve pas une vide
        else {
            int i = 5;
            while (CellulesJeu[i][nouvelleColonne] == null) {
                i--;         
            }
        // On affecte le nouveaux jetons à la Cellule
            return (CellulesJeu[i][nouvelleColonne].affecterJeton(nouveauJetonColonne));
        }
    }
    
 // etreRemplie()  (on test tout les cases si une est vide elle n'est pas vide)
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
}

/*                  
// définition de la class "Voiture
 public class Voiture {s
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
    