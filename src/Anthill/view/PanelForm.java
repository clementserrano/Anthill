package Anthill.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author clementserrano
 */
public class PanelForm extends JPanel{
    
    private GUI f;
    
    public PanelForm(GUI f){
        this.f=f;
        
        JLabel l_nbFourmis = new JLabel("Nombre de fourmis : ");
        JTextField t_nbFourmis = new JTextField();
        
        JLabel l_timeSleep = new JLabel("Temps entre chaque tour : ");
        JTextField t_timeSleep = new JTextField();
        
        JButton btn = new JButton("Lancer la simulation");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setNbFourmis(new Integer(t_nbFourmis.getText()));
                f.setTimeSleep(new Integer(t_timeSleep.getText()));
                f.setCarte("");
                f.setGrille();
            }
        });
    }
}
