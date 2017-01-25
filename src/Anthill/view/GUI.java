package Anthill.view;

import Anthill.model.Environnement;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Interface graphique représentant en temps réel la simulation
 *
 * @author clementserrano
 */
public class GUI extends JFrame {

    private Environnement e;
    private JLabel[][] labelGrille;
    private int nbFourmis;
    private int timeSleep;
    private String carte;

    public GUI(Environnement e) {
        this.e = e;
        this.labelGrille = new JLabel[e.getGrille().length][e.getGrille()[0].length];

        setTitle("Anthill");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // fullscreen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setForm();
        setGrille();
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
    
    public void setGrille(){
        PanelGrille panel = new PanelGrille(labelGrille,e);
        setContentPane(panel);
    }
    
    public void setForm(){
        PanelForm panel = new PanelForm(this);
        setContentPane(panel);
    }

    public int getNbFourmis() {
        return nbFourmis;
    }

    public void setNbFourmis(int nbFourmis) {
        this.nbFourmis = nbFourmis;
    }

    public int getTimeSleep() {
        return timeSleep;
    }

    public void setTimeSleep(int timeSleep) {
        this.timeSleep = timeSleep;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }
    
    
}
