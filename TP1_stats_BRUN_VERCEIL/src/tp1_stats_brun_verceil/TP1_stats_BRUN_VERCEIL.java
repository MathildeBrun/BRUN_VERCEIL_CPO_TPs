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
    // Question 1        
        int[] face = new int[6]; // réservation de la mémoire
        face[0]=0; // Mise dans chaque case de sa valeur
        face[1]=0;
        face[2]=0;
        face[3]=0;
        face[4]=0;
        face[5]=0;
    
    //Question 2
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier");
        m = sc.nextInt();
     
    // Question 3
    int i = 1;
    Random generateurAleat = new Random();

    for (i=1; i<=m; i++) {
        int nb = generateurAleat.nextInt(5);
        face[nb-1]= face[nb-1]++;
    }
    
    System.out.print(face[0]+ ", "+face[1]+", "+face[2]+", "+face[3]+", "+face[4]+", "+face[5]);
    
    }
    
}
