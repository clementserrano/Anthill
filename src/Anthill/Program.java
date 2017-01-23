package Anthill;
import Anthill.model.Environnement;

/**
 * Contient le main() du projet
 * @author clementserrano
 */
public class Program {

    public static void main(String[] args) {
        Environnement environnement = new Environnement("carte2.txt",1);
        environnement.run();
    }
}
