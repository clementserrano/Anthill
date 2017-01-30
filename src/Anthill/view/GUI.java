package Anthill.view;

import Anthill.model.Environnement;
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
    
    /**
     * Constructeur, affiche l'interface avec formulaire
     */
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

    /**
     * Affiche la simulation
     */
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

    /**
     * Met à jour la grille selon les modifications de l'environnement
     */
    public void update() {
        grille.update();
    }

    /**
     * Modifie la carte de la simulation
     * @param carte
     */
    public void setCarte(String carte) {
        this.carte = carte;
    }

    /**
     * Modifie le nombre de fourmis de la simulation
     * @param nbFourmis
     */
    public void setNbFourmis(int nbFourmis) {
        this.nbFourmis = nbFourmis;
    }

    /**
     * Modifie le temps entre chaque tour de la simulation
     * @param timeSleep
     */
    public void setTimeSleep(int timeSleep) {
        this.timeSleep = timeSleep;
    }
    
    /**
     * Modifie la quantité de nourriture dans chaque source de la simulation
     * @param qteNourriture
     */
    public void setQteNourriture(int qteNourriture){
        this.qteNourriture = qteNourriture;
    }

    /**
     * Notifie le programme que la simulation est prête a être lancée
     * @param ready
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    /**
     * Indique si la simulation est prête a être lancée
     * @return
     */
    public boolean isReady() {
        return ready;
    }
}
