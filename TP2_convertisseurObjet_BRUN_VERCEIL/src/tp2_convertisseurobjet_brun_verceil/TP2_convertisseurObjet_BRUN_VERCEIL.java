/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_convertisseurobjet_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class TP2_convertisseurObjet_BRUN_VERCEIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création de 2 objet de type Convertisseur et application de diverses conversions
        Convertisseur premieresConversions = new Convertisseur() ;
        premieresConversions.CelciusVersFarenheit(50);
        premieresConversions.KelvinVersCelcius(150);
     
        Convertisseur deuxiemesConversions = new Convertisseur() ;
        deuxiemesConversions.KelvinVersFarenheit(1234);
        deuxiemesConversions.CelciusVersKelvin(93746);
        
        //Affichage du nombre de conversion effectuées par chaque objet.
        System.out.println(premieresConversions);
        System.out.println(deuxiemesConversions);
    }
    
}
