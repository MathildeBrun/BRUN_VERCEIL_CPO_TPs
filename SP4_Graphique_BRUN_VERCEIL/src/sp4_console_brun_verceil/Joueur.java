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
public class Joueur {
    // Création des attributs
    String Nom;
    String Couleur;
    Jeton [] ListeJetons = new Jeton[21];
    int nombreJetonsRestants = 0;
    int nombreDesintegrateurs=0;

    // Création du contructeur
    public Joueur(String unNom) {
        Nom = unNom;
    }
    
    // Création des méthodes
    public void affecterCouleur(String uneCouleur) {
        Couleur = uneCouleur;
    }
    
    public boolean ajouterJeton(Jeton nouveauJetonJoueur){
        if (nombreJetonsRestants == 21){
            return(false);
        }
        else {
            ListeJetons[nombreJetonsRestants]  = nouveauJetonJoueur;
            nombreJetonsRestants++;
            return(true);
        }
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs++;
    }
    
    public boolean utiliserDesintegrateur(){
        if(nombreDesintegrateurs>0){
            nombreDesintegrateurs--;
            return(true);
        }
        else{
            return(false);
        }
        
    }
}