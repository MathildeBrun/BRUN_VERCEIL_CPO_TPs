/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_brun_verceil;

import javax.swing.JButton;

/**
 *
 * @author Mathilde
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule;
    }
}
