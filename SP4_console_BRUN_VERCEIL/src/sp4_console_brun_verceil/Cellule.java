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

// Class "Cellule"

public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
 // Constructeur "Cellule"
    public Cellule() {
        jetonCourant = null;
        trouNoir = false;
        desintegrateur = false;
    }

// Methode affecterJeton

    public boolean affecterJeton(Jeton nouveauJetonCellule) { 
        if (jetonCourant == null) {
            jetonCourant = nouveauJetonCellule;
            return(true);
        }
        else {
            return(false);
        }
    }


// lireCouleurDuJeton()
    
    public String lireCouleurDuJeton() {

        return jetonCourant.lireCouleur();

    } 

    public boolean placerTrouNoir(){
        if(trouNoir==false){
            trouNoir=true;
            return(true); 
        }
        else{
            return(false);
        }    
    }
    
    public boolean presenceTrouNoir(){
        if(trouNoir==true){
            return(true);
        }
        else{
            return(false);
        }
    }

    public boolean activerTrouNoir(){
        if(trouNoir==true){
            jetonCourant=null;
            trouNoir=false;
            return(true);
        }
        else{
            return(false);
        }
    }

    public boolean presenceDesintegrateur(){
        if(desintegrateur==true){
            return(true);
        }
        return(false);
    }

}