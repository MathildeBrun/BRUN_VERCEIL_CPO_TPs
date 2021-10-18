/*
BRUN VERCEIL FGE2 TDC
TP1 stats
08/10/21
 */
package tp1_stats_brun_verceil;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class TP1_stats_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Question 1  : Réservation mémoire et initialisation du tableau
        int[] face = new int[6];
        face[0]=0;
        face[1]=0;
        face[2]=0;
        face[3]=0;
        face[4]=0;
        face[5]=0;
    
    //Question 2 : demande et récupération d'un chiifre entrée par l'utilisateur (on prend m = choix pour la clarté du programme)
    
        int choix  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier");
        choix = sc.nextInt();
     
    // Question 3 : 
    
    // Initialisation des variables
    int i = 1;
    Random generateurAleat = new Random();
    
    //  incrémentation d'un élément aléatoire du tableau x fois (x = choix) (on modélise x lancer de dés et on compte le nombre de fois que l'on tombe sur chaque faces)
    for (i=1; i<=choix; i++) {
        int nb = generateurAleat.nextInt(5);
        face[nb] += 1;
    }
    // Affichage du pourcentage d'apparition de chaque faces
    i=0;
    for (i=0; i<6; i++) {
        System.out.println("Le pourcentage de chiffre "+i+" généré aléatoirement est de : "+((100.*face[i])/choix)+" %.");
    }
    
    }
}
