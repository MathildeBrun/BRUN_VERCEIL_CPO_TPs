/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_brun_verceil;

/**
 *
 * @author thvel
 */



// définition de la classe
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures = new Voiture[3];
    
    
// définition du constructeur 
public Personne(String unNom, String unPrenom) {
   nom = unNom;
   prenom = unPrenom;
   nbVoitures = 0;     
}

// ReDéfinition de la façon dont affiche System.out.println()
   @Override // Ecrassement de la methode originel
   public String toString() {
       String chaine_a_retourner;
       chaine_a_retourner = nom + " " + prenom ; 
       return chaine_a_retourner ; 
    }    
   
//Définition d'une méthode
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) { 
    boolean reussit = true; 
    
        if (voiture_a_ajouter.Proprietaire != null ) {
            reussit = false;
        }
        
        if ( nbVoitures>= 3) {
            reussit = false;
        }
        
        else {
                    liste_voitures[nbVoitures] = voiture_a_ajouter; 
                    nbVoitures ++;
                    voiture_a_ajouter.Proprietaire = this ; 
        }
        
        
        
        
        
    return reussit;
 
}

}