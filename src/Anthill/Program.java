package Anthill;

import Anthill.view.GUI;

/**
 * Contient le main() du projet qui crée l'interface graphique et affiche le
 * formulaire. Puis bloque tant que le formulaire n'a pas été soumis. Une fois
 * le formulaire soumis, l'environnement et créer et la simulation s'affiche
 *
 * @author clementserrano
 */
public class Program {

    public static void main(String[] args) {
        GUI fenetre = new GUI(); // Créer l'interface graphique et affiche le formulaire
        while (!fenetre.isReady()); // Tant que le formulaire n'est pas soumis, bloque
        fenetre.showGrille(); // Le formulaire a été soumis, création de l'environnement et affichage de la simulation
    }
}
