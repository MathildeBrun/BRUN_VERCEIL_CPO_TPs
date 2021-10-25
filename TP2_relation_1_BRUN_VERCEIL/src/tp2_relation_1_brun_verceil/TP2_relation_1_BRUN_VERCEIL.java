/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_relation_1_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class TP2_relation_1_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        
       // création du nouveaux objet voiture et personne 
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        // Multiplat fiat
        // Renault zoné

        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 

        // affichage de la liste des voitures
        System.out.println("liste des voitures disponibles "+ uneClio  + 
        "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ; 

        // Relation entre personne et voiture
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = uneAutreClio ;
        bob.nbVoitures = 2 ; 
        
        reno.liste_voitures[0] = une2008 ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ; 
        
        // test de la méthode ajouter_voiture
        reno.ajouter_voiture(uneClio);
        
        System.out.println("les voitures de Bob sont une " + bob.liste_voitures[0] + " et une " + bob.liste_voitures[1] ) ;
        System.out.println("les voitures de Reno sont une " + reno.liste_voitures[0]  + ", une " + reno.liste_voitures[1] + " et une " + reno.liste_voitures[2] ) ;
    }
    
}
