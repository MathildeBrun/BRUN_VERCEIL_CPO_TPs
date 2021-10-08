/*
BRUN VERCEIL FGE2 TDC
TP0 Exercice 1
27/09/21
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String prenom;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Bonjour, quel est votre prenom ?");
    prenom = sc.nextLine();        
    System.out.println("Au revoir " + prenom);
        
    }    
}
