/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anthill.view;

import Anthill.model.Environnement;
import Anthill.util.Images;
import Anthill.util.Taille;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author clementserrano
 */
public class Grille extends JPanel {

    private Environnement environnement;
    private JLabel[][] labelGrille;

    public Grille(Environnement environnement, JLabel[][] labelGrille) {
        this.environnement = environnement;
        this.labelGrille = labelGrille;

        setLayout(new GridLayout(labelGrille.length, labelGrille[0].length));
        for (int i = 0; i < labelGrille.length; i++) {
            for (int j = 0; j < labelGrille[0].length; j++) {
                JLabel label = new JLabel();
                if (environnement.getGrille()[i][j].toString() == "#") {
                    label.setBackground(Color.LIGHT_GRAY);
                    label.setOpaque(true);
                }
                labelGrille[i][j] = label;
                add(label);
            }
        }
        update();
    }

    public void update() {
        for (int i = 0; i < labelGrille.length; i++) {
            for (int j = 0; j < labelGrille[0].length; j++) {
                JLabel label = labelGrille[i][j];
                switch (environnement.getGrille()[i][j].toString()) {
                    case "o":
                        Images.source(label, environnement.getGrille()[i][j]);
                        break;
                    case "x":
                        Images.fourmiliere(label, environnement.getGrille()[i][j]);
                        break;
                    case " ":
                        Images.cellule_vide(label, environnement.getGrille()[i][j]);
                        break;
                }
                if (environnement.getGrille()[i][j].toString() != "#") {
                    setBackGroundPheromone(label, environnement.getGrille()[i][j].getQtePheromone());
                }
                label.setPreferredSize(new Dimension(Taille.hauteur+1, Taille.largeur+1));
                label.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                label.setHorizontalAlignment(SwingConstants.CENTER);
            }
        }
    }

    private void setBackGroundPheromone(JLabel label, int qtePheromone) {
        if (qtePheromone == 0) {
            label.setOpaque(false);
        } else {
            
            int rouge = 185 - 10 * qtePheromone;
            if (rouge < 0) {
                rouge = 0;
            }
            
            int vert = 234 - 15 * qtePheromone;
            if (vert < 0) {
                vert = 0;
            }
            
            label.setBackground(new Color(rouge, vert, 255));
            label.setOpaque(true);
        }
    }
}
