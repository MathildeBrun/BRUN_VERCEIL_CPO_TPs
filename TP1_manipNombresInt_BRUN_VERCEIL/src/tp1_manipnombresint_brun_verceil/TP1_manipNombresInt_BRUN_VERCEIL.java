/*
BRUN VERCEIL FGE2 TDC
TP1 manipNombresInt
08/10/21
 */
package tp1_manipnombresint_brun_verceil;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class TP1_manipNombresInt_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initialisation des variables 
        int nb1 = 0;
        int nb2 = 0;
        
        // commande de demande d'entrée pour l'utilsateurs 
        Scanner sc = new Scanner(System.in); 
        
        // Récupération des nombre de l'utilisateurs
        System.out.println("Entrez un premier nombre :");
        nb1 =sc.nextInt();
        System.out.println("Entrez un deuxième nombre :");
        nb2 =sc.nextInt();
        
        // Affichage des deux nombres choisit
        System.out.println("Nombre 1 : "+ nb1);
        System.out.println("Nombre 2 : "+ nb2);
        
        // Affichage du résultat des opérations mathématiques
        System.out.println("La somme de vos deux nombre est "+(nb1+nb2));
        System.out.println("La différence de vos deux nombre est "+(nb1-nb2));
        System.out.println("Le produit de vos deux nombre est "+(nb1*nb2));
        System.out.println("Le quotien entier du 1er nombre par le 2ème est : "+(nb1/nb2)); // le résultat arrondi à l'entier inférieur.
        
        System.out.println("Le reste de la division euclidienne du 1er nombre par le 2ème est : "+(nb1%nb2));
        // Note : Définition opération modulo% : On divise le 1er nombre par le 2ème et on affiche le reste de la division ou 0 si c'est une division parfaite. 
        
        
    }
}
