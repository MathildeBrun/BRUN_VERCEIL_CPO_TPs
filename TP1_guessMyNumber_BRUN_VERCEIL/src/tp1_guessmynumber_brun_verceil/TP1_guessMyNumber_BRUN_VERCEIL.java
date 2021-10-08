/*
BRUN VERCEIL FGE2 TDC
TP1 guesseMyNumber
08/10/21
 */
package tp1_guessmynumber_brun_verceil;

import java.util.Random;

/**
 *
 * @author Mathilde
 */
public class TP1_guessMyNumber_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nmb1 = generateurAleat.nextInt(100);
        int nmb2 = generateurAleat.nextInt(100);
        int nmb3 = generateurAleat.nextInt(100);
        int nmb4 = generateurAleat.nextInt(100);
        int nmb5 = generateurAleat.nextInt(100);
        System.out.println("Les 5 nombres générés aléatoirement sont : "+nmb1+", "+nmb2+", "+nmb3+", "+nmb4+", "+nmb5);
        
    }
    
}
