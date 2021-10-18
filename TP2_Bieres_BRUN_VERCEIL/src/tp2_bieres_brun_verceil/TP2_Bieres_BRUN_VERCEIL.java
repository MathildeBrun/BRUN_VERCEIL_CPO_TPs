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
        /*
        Questions précédent la 10.
        BouteilleBiere uneBiere = new BouteilleBiere() ; // Création du nouvel objet et affectation de ses attributs.
        uneBiere.nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = (float) 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere() ; // Création du nouvel objet et affectation de ses attributs.
        deuxiemeBiere.nom = "Leffe"; 
        deuxiemeBiere.degreAlcool = 6.6 ;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        deuxiemeBiere.ouverte = false;
        deuxiemeBiere.lireEtiquette();
        */
        
        // Déclaration de 4 bieres à l'aide du constructeur créé.
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneDeuxiemeBiere = new BouteilleBiere("Goudale", 7.2 ,"Brasserie Goudale") ;
        uneDeuxiemeBiere.lireEtiquette();
        
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Pastor'al", 8.5 ,"La Pastorale") ;
        uneTroisiemeBiere.lireEtiquette();
        
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Delirium", 8.6 ,"ZooBrew") ;
        uneQuatriemeBiere.lireEtiquette();
        
        // Utilisation de la méthode Décapsuler et vérification du changement de valeur de la variable "ouverte".
        uneQuatriemeBiere.Décapsuler();
        System.out.println(uneQuatriemeBiere.ouverte);
        

    }
    
    
}
