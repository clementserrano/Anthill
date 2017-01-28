package Anthill.view;

import Anthill.model.Environnement;
import Anthill.util.Images;
import Anthill.util.Taille;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Interface graphique représentant en temps réel la simulation
 *
 * @author clementserrano
 */
public class GUI extends JFrame {

    private JPanel panels;
    private Form form;
    private Grille grille;
    
    private String carte;
    private int nbFourmis;
    private int timeSleep;
    private int qteNourriture;
    private volatile boolean ready = false;
    
    public GUI() {
        panels = new JPanel(new CardLayout());
        form = new Form(this);
        panels.add(form);
        add(panels);
        
        pack();
        setTitle("Anthill");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void showGrille() {
        Environnement environnement = new Environnement(carte, nbFourmis, timeSleep, qteNourriture);
        Taille.setEnvironnement(environnement);
        JLabel[][] labelGrille = new JLabel[environnement.getGrille().length][environnement.getGrille()[0].length];
        grille = new Grille(environnement, labelGrille);
        panels.add(grille);

        CardLayout cl = (CardLayout) (panels.getLayout());
        cl.next(panels);
        pack();
        setLocationRelativeTo(null);

        environnement.setObservateur(this);
        environnement.run();
    }

    public void update() {
        grille.update();
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public void setNbFourmis(int nbFourmis) {
        this.nbFourmis = nbFourmis;
    }

    public void setTimeSleep(int timeSleep) {
        this.timeSleep = timeSleep;
    }
    
    public void setQteNourriture(int qteNourriture){
        this.qteNourriture = qteNourriture;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady() {
        return ready;
    }
}
