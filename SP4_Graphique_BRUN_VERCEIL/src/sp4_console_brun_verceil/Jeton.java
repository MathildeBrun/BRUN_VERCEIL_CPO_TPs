/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class Jeton {
    String Couleur;
    public Jeton(String uneCouleur) {
        Couleur = uneCouleur;
    }
    public String lireCouleur() {
        return(Couleur);
    }
    
}
