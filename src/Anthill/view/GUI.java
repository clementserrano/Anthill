package Anthill.view;

import Anthill.model.Environnement;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Interface graphique représentant en temps réel la simulation
 *
 * @author clementserrano
 */
public class GUI extends JFrame {

    private Environnement e;
    private JLabel[][] labelGrille;

    public GUI(Environnement e) {
        this.e = e;
        this.labelGrille = new JLabel[e.getGrille().length][e.getGrille()[0].length];

        setTitle("Anthill");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(labelGrille.length, labelGrille[0].length));
        for (int i = 0; i < labelGrille.length; i++) {
            for (int j = 0; j < labelGrille[0].length; j++) {
                JLabel label = new JLabel(e.getGrille()[i][j].toString());
                
                label.setFont(new Font("Calibri", Font.PLAIN, 30));
                label.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                
                label.setBackground(Color.red);
                if(e.getGrille()[i][j].getNbrFourmi()!=0){
                    label.setOpaque(true);
                }
                
                labelGrille[i][j] = label;
                panel.add(label);
            }
        }

        setContentPane(panel);
    }

    public void update() {
        for (int i = 0; i < labelGrille.length; i++) {
            for (int j = 0; j < labelGrille[0].length; j++) {
                labelGrille[i][j].setText(e.getGrille()[i][j].toString());
                if(e.getGrille()[i][j].getNbrFourmi()!=0){
                    labelGrille[i][j].setOpaque(true);
                }else{
                    labelGrille[i][j].setOpaque(false);
                }
            }
        }
        repaint();
    }
}
