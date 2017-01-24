package Anthill;
import Anthill.model.Environnement;
import Anthill.view.GUI;

/**
 * Contient le main() du projet
 * @author clementserrano
 */
public class Program {

    public static void main(String[] args) {
        Environnement environnement = new Environnement("carte2.txt");
        
        GUI fenetre = new GUI(environnement);
        fenetre.setVisible(true);
        
        environnement.setObservateur(fenetre);
        environnement.run();
    }
}
