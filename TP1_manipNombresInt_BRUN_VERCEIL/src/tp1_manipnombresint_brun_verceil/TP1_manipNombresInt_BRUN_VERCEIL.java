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
        int nb1 = 0; // Création des 2 variables recevant les 2 entiers rentrés par l'utilisateur.
        int nb2 = 0;
        
        Scanner sc = new Scanner(System.in); //
        System.out.println("Entrez un premier nombre :"); // On affiche à l'utilisateur qu'il doit entrer un 1ère nombre.
        nb1 =sc.nextInt(); // On récupère le 1er entier dans notre première variable
        System.out.println("Entrez un deuxième nombre :"); // On affiche à l'utilisateur qu'il doit rentrer un 2ème nombre.
        nb1 =sc.nextInt(); // On récupère le 2ème entier dans notre deuxième variable
        System.out.println("Nombre 1 : "+ nb1); // On affiche notre premier nombre.
        System.out.println("Nombre 2 : "+ nb2); // On affiche notre second nombre.
        
        System.out.println("La somme de vos deux nombre est "+(nb1+nb2));
        System.out.println("La différence de vos deux nombre est "+(nb1-nb2));        
        System.out.println("La somme de vos deux nombre est "+(nb1*nb2));        
        
        
    }
}
