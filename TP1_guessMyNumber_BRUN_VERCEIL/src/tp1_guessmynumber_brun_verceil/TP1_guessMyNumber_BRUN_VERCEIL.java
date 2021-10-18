/*
BRUN VERCEIL FGE2 TDC
TP1 guesseMyNumber
08/10/21
*/
package tp1_guessmynumber_brun_verceil;

import java.util.Random;
import java.util.Scanner;

/**
* @author Mathilde
*/
public class TP1_guessMyNumber_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Random generateurAleat = new Random();
        
        // Partie 1 Guess my number \\
        
        int nmb1 = generateurAleat.nextInt(100);
        int nmb2 = generateurAleat.nextInt(100);
        int nmb3 = generateurAleat.nextInt(100);
        int nmb4 = generateurAleat.nextInt(100);
        int nmb5 = generateurAleat.nextInt(100);
        System.out.println("Les 5 nombres générés aléatoirement sont : "+nmb1+", "+nmb2+", "+nmb3+", "+nmb4+", "+nmb5);
        
        
        // *Guess my number programe* \\
        
        // Initialisation des varialbe
        int choix = 0;
        int UserNumber; 
        int RandomNumber = generateurAleat.nextInt(100);
        int nbTentative = 1;
        
        // Sélection de la difficulté
        System.out.println("Veuillez sélectionner selection votre difficulté :\n1) Facile\n2) Moyen\n3) Difficile\n4) Cauchemard");
        Scanner sc = new Scanner(System.in); 
        choix = sc.nextInt();
        
        // Facile : coup illimité \\
        if (choix == 1) {
            System.out.println("Vous êtes en mode facile.\nVotre nombre de coups est illimité.\nVeuillez entrer un nombre entre 0 et 100 inclus :");
            UserNumber =sc.nextInt();

            // boucle de demande, tant que l'utilisteur n'a pas trouvé le nombre
            while (UserNumber != RandomNumber) {
                if (UserNumber < RandomNumber) {
                    System.out.println("Trop petit");
                }
                if (UserNumber > RandomNumber) {
                    System.out.println("Trop grand");                
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                UserNumber =sc.nextInt();
                nbTentative++;
                }
            // L'utilisateur gagne
            System.out.println("Bravo, vous avez trouvé la valeur de l'ordinateur.\nVous avez fait "+nbTentative+" tentatives.");
            }
            
        
        // Moyen : limité à 30 tentatives \\
        if (choix == 2) {
            System.out.println("Vous avez 30 tentatives pour trouver le chiffre de l'ordinateur");
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");
            UserNumber =sc.nextInt();

            // boucle de demande, nouvelle condition lié au nombre de tentative (variable indentée)
            while (UserNumber!= RandomNumber && nbTentative <=30) {
                if (UserNumber < RandomNumber) {
                    System.out.println("trop petit");
                }
                if (UserNumber > RandomNumber) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                UserNumber =sc.nextInt();
                nbTentative++;
            }
            
            // L'utilisateur perd ou gagne
            if (nbTentative>30) {
                System.out.println("Vous avez atteint le nombre de tentatives maximales.\nBien essayé mais les machines vous sont supérieures.");
            }
            else {
                System.out.println("Bravo, vous avez trouvé la valeur de l'ordinateur.\nVous avez fait "+nbTentative+" tentatives.\nVous avez triomphé des machines. Enfin pour le moment...");
            }
        }
        
        // Difficile : nombre de tentative : 20, domaine de cherche élargit de 100 à 200 \\
        if (choix == 3) {
            System.out.println("Vous avez 20 tentatives ");
            System.out.println("Veuillez entrer un nombre entre 0 et 200 inclus :");
            UserNumber =sc.nextInt();
            RandomNumber = generateurAleat.nextInt(150);

            // boucle de demande, avec deux conditions (nombre trouvé, tentative indenté)
            while (UserNumber!= RandomNumber) {
                if (UserNumber < RandomNumber) {
                    System.out.println("trop petit");
                }
                if (UserNumber > RandomNumber) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                UserNumber =sc.nextInt();
                nbTentative++;
            }
            
            // L'utilisateur perd ou gagne
            if (nbTentative>20) {
                System.out.println("Bien essayé mais les machines vous sont supérieures.");
            }
            else {
                System.out.println("Bravo, vous avez trouvé la valeur de l'ordinateur.\nVous avez fait "+nbTentative+" tentatives.");
            }
        }
        
        
        // Cauchemard : tentative illimité \\
        if (choix == 4) {
            System.out.println("Vous allez entrer dans le mode cauchemard.\nCe mode sera votre pire ennemi\nLa réponse que vous donnera l'ordinateur sera fausse avec une probabilitée de 30%\nBon courage");
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");

            UserNumber =sc.nextInt();

            //Boucle de demande à deux conditions (nombre trouvé, tentative indenté)
            while (UserNumber!= RandomNumber) {
                
                // Celon la RNG le programme renvoit l'indication opposé (30% de chance de mauvaise indication)
                int RNG = generateurAleat.nextInt(100);
                
                if (UserNumber < RandomNumber) {
                    if (RNG>= 30){
                    System.out.println("trop petit");
                    }
                    else {
                    System.out.println("trop grand");
                    }
                }
                if (UserNumber > RandomNumber) {
                    if (RNG>= 30){
                        System.out.println("trop grand");
                    }
                    else {
                        System.out.println("trop petit");
                    }
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                UserNumber =sc.nextInt();
                nbTentative++;
            }
            
            // L'utilisateur gagne
            System.out.println("Bravo, vous avez trouvé la valeur de l'ordinateur.\nVous avez fait "+nbTentative+" tentatives.\nVous avez triomphé des machines. Enfin pour le moment...");
        }
    }
}