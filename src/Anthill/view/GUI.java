package Anthill.view;

import javax.swing.JFrame;

/**
 * Interface graphique représentant en temps réel la simulation
 * @author clementserrano
 */
public class GUI extends JFrame {
    
    public GUI(){
        setTitle("Anthill");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        setVisible(true);
    }
}
