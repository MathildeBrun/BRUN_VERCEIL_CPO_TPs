/*
BRUN VERCEIL FGE2 TDC
TP1 convertisseur
08/10/21
 */
package tp1_convertisseur_brun_verceil;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */


public class TP1_convertisseur_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    
    public static double CelciusVersKelvin (double tCelcius) {

       
        double valeur = 0;
        
        Scanner sc = new Scanner(System.in); // commande de demande d'entrée pour l'utilsateurs 
                
        System.out.println("Entrez une valeur :"); // On affiche à l'utilisateur qu'il doit entrer un 1ère nombre.
        valeur = sc.nextDouble(); // On récupère la première valeur dans notre première variable
        
        System.out.println("valeur en degrés:" + valeur);
        
        valeur += 274.15;
        
    
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        

    }
    
}
