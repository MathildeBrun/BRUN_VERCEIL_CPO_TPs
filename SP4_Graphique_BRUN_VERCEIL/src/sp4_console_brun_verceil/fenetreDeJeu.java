/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_brun_verceil;

/**
 *
 * @author thvel
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 672, 576));

        panneau_info_joueur.setBackground(new java.awt.Color(102, 255, 102));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_info_joueur.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_info_joueur.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_info_joueur.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 25));
        panneau_info_joueur.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 25));

        btn_start.setText("Démarrer la partie");
        panneau_info_joueur.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 310, 110));

        panneau_creation_partie.setBackground(new java.awt.Color(102, 255, 102));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Infos joueurs");
        panneau_creation_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setText("Desintégrateur :");
        panneau_creation_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneau_creation_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setText("Couleur :");
        panneau_creation_partie.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbl_j1_nom.setText("nomJoueur1");
        panneau_creation_partie.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_creation_partie.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_creation_partie.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));
        panneau_creation_partie.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 10));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_creation_partie.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel7.setText("Desintégrateur :");
        panneau_creation_partie.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel8.setText("Couleur :");
        panneau_creation_partie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur1");
        panneau_creation_partie.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        lbl_j2_nom.setText("nomJoueur1");
        panneau_creation_partie.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel9.setText("Joueur 2 :");
        panneau_creation_partie.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 310, 260));

        panneau_info_partie.setBackground(new java.awt.Color(102, 255, 102));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Infos jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("Joueur courant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        message.setViewportView(jTextArea1);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 310, 180));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 10, 94, -1));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 10, 94, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 10, 94, -1));

        btn_col_3.setText("4");
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 94, -1));

        btn_col_4.setText("5");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 10, 94, -1));

        btn_col_5.setText("7");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 10, 94, -1));

        btn_col_6.setText("6");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 10, 94, -1));

        setBounds(0, 0, 1047, 704);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}