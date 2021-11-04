/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class SP4_console_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bien le bonjour joueurs !\nVeuillez entrer le nom du premier joueur :");
        Scanner sc = new Scanner(System.in); 
        String nomJ1 = sc.next();
        System.out.println("Bien, merci à vous et bienvenue parmi nous "+nomJ1);
        System.out.println("A présent, veuillez entrer le nom du premier joueur :");
        String nomJ2 = sc.next();
        System.out.println("Bien, merci à vous et bienvenue parmi nous "+nomJ2);
        System.out.println("Bonne chance "+nomJ1+" et "+nomJ2+"\nQue le meilleur gagne !");
    }
}
