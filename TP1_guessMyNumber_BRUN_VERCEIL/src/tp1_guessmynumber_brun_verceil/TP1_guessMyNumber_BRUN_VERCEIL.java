/*
BRUN VERCEIL FGE2 TDC
TP1 guesseMyNumber
08/10/21
 */
package tp1_guessmynumber_brun_verceil;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mathilde
 */
public class TP1_guessMyNumber_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choix = 0;
        Random generateurAleat = new Random();
        int nmb1 = generateurAleat.nextInt(100); // Génération de 5 nombres aléatoires
        int nmb2 = generateurAleat.nextInt(100);
        int nmb3 = generateurAleat.nextInt(100);
        int nmb4 = generateurAleat.nextInt(100);
        int nmb5 = generateurAleat.nextInt(100);
        System.out.println("Les 5 nombres générés aléatoirement sont : "+nmb1+", "+nmb2+", "+nmb3+", "+nmb4+", "+nmb5);
        
        int nbHum;
        int numAl = generateurAleat.nextInt(100);
        int nbTent = 1;
        
        System.out.println("Veuillez sélectionner selection votre difficulté :\n1) Facile\n2) Moyen\n3) Difficile\n4) Cauchemard");
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();
        
        if (choix == 1); {
        
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");
            nbHum =sc.nextInt();

            while (nbHum!= numAl) {
                if (nbHum < numAl) {
                    System.out.println("trop petit");
                }
                if (nbHum > numAl) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                nbHum =sc.nextInt();
                nbTent++;
            }
            System.out.print("Bravo, vous avez trouvé la valeur de l'ordinateur. Vous avez fait "+nbTent+" tentatives.");
        }   
            
        if (choix == 1); {
        
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");
            nbHum =sc.nextInt();

            while (nbHum!= numAl) {
                if (nbHum < numAl) {
                    System.out.println("trop petit");
                }
                if (nbHum > numAl) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                nbHum =sc.nextInt();
                nbTent++;
            }
            System.out.print("Bravo, vous avez trouvé la valeur de l'ordinateur. Vous avez fait "+nbTent+" tentatives.");
        }
            
            
        if (choix == 2); {
        
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");
            nbHum =sc.nextInt();

            while (nbHum!= numAl) {
                if (nbHum < numAl) {
                    System.out.println("trop petit");
                }
                if (nbHum > numAl) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                nbHum =sc.nextInt();
                nbTent++;
            }
            System.out.print("Bravo, vous avez trouvé la valeur de l'ordinateur. Vous avez fait "+nbTent+" tentatives.");
            
        }
            
            
        if (choix == 3); {
        
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");
            nbHum =sc.nextInt();

            while (nbHum!= numAl) {
                if (nbHum < numAl) {
                    System.out.println("trop petit");
                }
                if (nbHum > numAl) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                nbHum =sc.nextInt();
                nbTent++;
            }
            System.out.print("Bravo, vous avez trouvé la valeur de l'ordinateur. Vous avez fait "+nbTent+" tentatives.");
            
        }
            
        if (choix == 4); {
        
            System.out.println("Veuillez entrer un nombre entre 0 et 100 inclus :");

            nbHum =sc.nextInt();

            while (nbHum!= numAl) {
                if (nbHum < numAl) {
                    System.out.println("trop petit");
                }
                if (nbHum > numAl) {
                    System.out.println("trop grand");
                }
                System.out.println("Veuillez entrer une nouvelle valeur :");
                nbHum =sc.nextInt();
                nbTent++;
            }
            System.out.print("Bravo, vous avez trouvé la valeur de l'ordinateur. Vous avez fait "+nbTent+" tentatives.");
        }
    }

   
