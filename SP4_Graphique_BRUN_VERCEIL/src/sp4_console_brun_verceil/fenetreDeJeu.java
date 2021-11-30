/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_brun_verceil;

import java.util.Random;

/**
 *
 * @author thvel
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur ListeJoueur[] = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }

                        if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) {
                            textemessage.setText("le joueur " + joueurCourant.Nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            c.supprimerJeton();
                            joueurSuivant();
                            
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                textemessage.setText("le joueur " + joueurCourant.Nom + " désintégre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                            } else {
                                return;
                            }
                        }
                        grilleJeu.tasserGrille(); // JSP POURQUOi ELLE FONCTIONNE PAS
                        
                        
                        // LE COPIER COLLE !!!!!!!!!!!
                        
                        // On rafraichie la grille est les données
                        lbl_j1_desint.setText(ListeJoueur[0].nombreDesintegrateurs + "");
                        lbl_j2_desint.setText(ListeJoueur[1].nombreDesintegrateurs + "");
                        panneau_grille.repaint();

                        // Test de victoire
                        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
                        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);
                        if (vict_j1 && !vict_j2) {
                            textemessage.setText("Victoire de " + ListeJoueur[0].Nom);
                        }
                        if (vict_j2 && !vict_j1) {
                            textemessage.setText("Victoire de " + ListeJoueur[1].Nom);
                        }
                        if (vict_j2 && vict_j1) {
                            if (joueurCourant == ListeJoueur[0]) {
                                textemessage.setText("Victoire de " + ListeJoueur[1].Nom + "faute de jeu de l'autre joueur");
                            }
                        }
                        if (vict_j2 && vict_j1) {
                            if (joueurCourant == ListeJoueur[1]) {
                                textemessage.setText("Victoire de " + ListeJoueur[0].Nom + "faute de jeu de l'autre joueur");
                            }
                        }
                        // FIN DU COPIER COLLER 
                    }
                });
                panneau_grille.add(cellGraph);
            }
        }
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
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
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
        textemessage = new javax.swing.JTextArea();
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

        panneau_creation_partie.setBackground(new java.awt.Color(102, 255, 102));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nom_joueur2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 25));

        nom_joueur1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 25));

        btn_start.setText("Démarrer la partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 310, 110));

        panneau_info_joueurs.setBackground(new java.awt.Color(102, 255, 102));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Infos joueurs");
        panneau_info_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setText("Desintégrateur :");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneau_info_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setText("Couleur :");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbl_j1_nom.setText("nomJoueur1");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));
        panneau_info_joueurs.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 10));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel7.setText("Desintégrateur :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel8.setText("Couleur :");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur2");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        lbl_j2_nom.setText("nomJoueur1");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel9.setText("Joueur 2 :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 310, 260));

        panneau_info_partie.setBackground(new java.awt.Color(102, 255, 102));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Infos jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("Joueur courant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

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
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 10, 94, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 10, 94, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 94, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 10, 94, -1));

        btn_col_5.setText("7");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 10, 94, -1));

        btn_col_6.setText("6");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 10, 94, -1));

        setBounds(0, 0, 1047, 704);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        if (grilleJeu.colonneRemplie(0))
            btn_col_0.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
       jouerDansColonne(2);
        if (grilleJeu.colonneRemplie(2))
            btn_col_2.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        if (grilleJeu.colonneRemplie(1))
            btn_col_1.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        if (grilleJeu.colonneRemplie(3))
            btn_col_3.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
       jouerDansColonne(4);
        if (grilleJeu.colonneRemplie(4))
            btn_col_4.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(5);
        if (grilleJeu.colonneRemplie(5))
            btn_col_6.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(6);
        if (grilleJeu.colonneRemplie(6))
            btn_col_5.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    public boolean jouerDansColonne(int colonneJoueur) {
        // message d'erreur 

        if (grilleJeu.colonneRemplie(colonneJoueur) == true) {
            System.out.println("Cette colonne est déjà remplie, veuillez placer votre pion dans une autre colonne.");
            return false;
        }

        // On cherche la ligne pour avoir les coordonnées
        int i = 0;
        while (grilleJeu.CellulesJeu[i][colonneJoueur].jetonCourant != null && i != 5) {
            i++;
        }
        // Si la cellule en question a un désintégrateur le joueur le récupère
        if (grilleJeu.CellulesJeu[i][colonneJoueur].desintegrateur == true) {
            System.out.println("\n" + joueurCourant.Nom + " a récupéré un désintégrateur\n");
            joueurCourant.obtenirDesintegrateur();
            grilleJeu.CellulesJeu[i][colonneJoueur].recupererDesintegrateur();
        }

        // Ajout du jeton
        grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], colonneJoueur);

        // le joueur à un jeton en moins
        joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null;
        joueurCourant.nombreJetonsRestants--;

        // On rafraichie la grille est les données
        lbl_j1_desint.setText(ListeJoueur[0].nombreDesintegrateurs + "");
        lbl_j2_desint.setText(ListeJoueur[1].nombreDesintegrateurs + "");
        panneau_grille.repaint();

        // Test de victoire
        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);
        if (vict_j1 && !vict_j2) {
            textemessage.setText("Victoire de " + ListeJoueur[0].Nom);
        }
        if (vict_j2 && !vict_j1) {
            textemessage.setText("Victoire de " + ListeJoueur[1].Nom);
        }
        if (vict_j2 && vict_j1) {
            if (joueurCourant == ListeJoueur[0]) {
                textemessage.setText("Victoire de " + ListeJoueur[1].Nom + "faute de jeu de l'autre joueur");
            }
        }
        if (vict_j2 && vict_j1) {
            if (joueurCourant == ListeJoueur[1]) {
                textemessage.setText("Victoire de " + ListeJoueur[0].Nom + "faute de jeu de l'autre joueur");
            }
        }

        return true;

    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueur[0]) {
            joueurCourant = ListeJoueur[1];
        } else {
            joueurCourant = ListeJoueur[0];
        }
        lbl_jcourant.setText(joueurCourant.Nom);
    }

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

    public void initialiserPartie() {
        String nomJoueur1 = nom_joueur1.getText();
        Joueur joueur1 = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur2.getText();
        Joueur joueur2 = new Joueur(nomJoueur2);

        
        
        ListeJoueur[0] = joueur1;
        ListeJoueur[1] = joueur2;

        
        // Détermination du 1er joueur
        Random player = new Random();
        boolean premierJoueur = player.nextBoolean();
        if (premierJoueur) {
            joueurCourant = ListeJoueur[0];
        } else {
            joueurCourant = ListeJoueur[1];
        }

        lbl_jcourant.setText(joueurCourant.Nom);
        
        attribuerCouleursAuxJoueurs();

        System.out.println(joueur1.Nom + " est de couleur " + joueur1.Couleur);
        System.out.println(joueur2.Nom + " est de couleur " + joueur2.Couleur);

        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(joueur1.Couleur);
        lbl_j2_couleur.setText(joueur2.Couleur);
        lbl_j1_desint.setText(joueur1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(joueur2.nombreDesintegrateurs + "");

        for (int i = 0; i < 21; i++) {
            Jeton JetonJoueur1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(JetonJoueur1);
        }
        for (int j = 0; j < 21; j++) {
            Jeton JetonJoueur2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(JetonJoueur2);
        }


        // Placement 3 premiers trous noirs
        int trouNoirPlaces = 0;
        while (trouNoirPlaces < 3) {
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if (grilleJeu.placerTrouNoir(ligne, colonne) == true) {
                trouNoirPlaces++;
            }
        }

        // Placement des 2 désintegrateurs qui se trouve sous les trous noirs et des trous noirs associés
        int desintegrateurTNPlaces = 0;
        while (desintegrateurTNPlaces < 2) {
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if (grilleJeu.placerTrouNoir(ligne, colonne) == true && grilleJeu.placerDesintegrateur(ligne, colonne) == true) {
                desintegrateurTNPlaces++;
            }
        }

        // Placement des 3 dernier désintegrateurs
        int desintegrateurPlaces = 0;
        while (desintegrateurPlaces < 3) {
            Random generateurAleat = new Random();
            int ligne = generateurAleat.nextInt(5);
            int colonne = generateurAleat.nextInt(6);
            if (grilleJeu.CellulesJeu[ligne][colonne].trouNoir == true && grilleJeu.placerDesintegrateur(ligne, colonne) == true) {
                grilleJeu.CellulesJeu[ligne][colonne].desintegrateur = false;
            } else if (grilleJeu.CellulesJeu[ligne][colonne].trouNoir == false && grilleJeu.placerDesintegrateur(ligne, colonne) == true) {
                desintegrateurPlaces++;
            }
        }
    }

    public void attribuerCouleursAuxJoueurs() {
        Random generateurAleat = new Random();
        int num = generateurAleat.nextInt(1);
        if (num == 1) {
            ListeJoueur[0].Couleur = "Rouge";
            ListeJoueur[1].Couleur = "Jaune";
        } else {
            ListeJoueur[0].Couleur = "Jaune";
            ListeJoueur[1].Couleur = "Rouge";
        }
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
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
