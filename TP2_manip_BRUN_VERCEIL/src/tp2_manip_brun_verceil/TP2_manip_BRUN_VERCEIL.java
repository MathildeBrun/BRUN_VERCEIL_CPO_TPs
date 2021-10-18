/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_manip_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class TP2_manip_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initialisation des tartiflette
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ;

        Tartiflette assiette3 = assiette2;
        
        // affichage des nb de Calories des tartiflettes
        System.out.println(assiette1.nbCalories);
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        
        
        // Test d'incrémentation
        assiette2.nbCalories += 100 ;
        System.out.println("\nnb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        assiette3.nbCalories += 100 ;
        System.out.println("\nnb de calories de Assiette 2 : " + assiette2.nbCalories) ;  // les deux sont liées si on augmente l'une l'autre augmente peut importe l'ordre
        
        // Inversion de valeur
        int stockage = 0;
                
        stockage = assiette1.nbCalories; 
        assiette1.nbCalories = assiette2.nbCalories;
        assiette2.nbCalories = stockage;
        
       // création du tableau référence avec nouvel objet 
       
       Moussaka[] service = new Moussaka[10];
       
       for (int i=0; i<10; i++) {
        
           service[i] = new Moussaka(100);
        
    }
    }
}
    

