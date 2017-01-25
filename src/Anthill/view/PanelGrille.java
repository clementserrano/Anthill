package Anthill.view;

import Anthill.model.Environnement;
import java.awt.Color;
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
public class PanelGrille extends JPanel {
    
    private JLabel[][] labelGrille;
    private Environnement e;
    
    public PanelGrille(JLabel[][] labelGrille, Environnement e){
        this.labelGrille = labelGrille;
        this.e = e;
        setLayout(new GridLayout(labelGrille.length, labelGrille[0].length));
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
                add(label);
            }
        }
    }
}
