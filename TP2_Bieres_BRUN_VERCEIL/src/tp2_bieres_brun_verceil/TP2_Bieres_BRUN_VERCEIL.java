/*
 BRUN VERCEIL FGE2 TDC
 TP2 Bieres
 08/10/21
*/
package tp2_bieres_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class TP2_Bieres_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ; // Création du nouvel objet et affectation de ses attributs.
        uneBiere.nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = (float) 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere() ; // Création du nouvel objet et affectation de ses attributs.
        deuxiemeBiere.nom = "Leffe"; 
        deuxiemeBiere.degreAlcool = (float) 6.6 ;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        deuxiemeBiere.ouverte = false;
        deuxiemeBiere.lireEtiquette();
    }
    
    
}
