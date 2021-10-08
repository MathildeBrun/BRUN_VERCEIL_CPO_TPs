/*
BRUN VERCEIL FGE2 TDC
TP0 Exercice 2
27/09/21
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
int nb;// nombre d'entiers a additionner
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
int result; // resultat
int ind; // indice
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb){
    result=result+ind;
    ind++;
}


// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + " entiers est: "+result);

    }
    
}
