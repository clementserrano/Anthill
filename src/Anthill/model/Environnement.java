package Anthill.model;

import Anthill.util.Readfile;
import java.util.ArrayList;

/**
 * Environnement représentant une carte où vont s'effectuer des déplacements de fourmis.
 * @author clementserrano
 */
public class Environnement {

    private Cellule[][] grille;
    private int nombreDeLignes;
    private int nombreDeColonnes;
    private int nombreDeSources;
    private int xFourmiliere;
    private int yFourmiliere;
    private ArrayList<Fourmi> fourmis;

    /**
     * Fait déplacer les fourmis jusqu'à que toutes les sources soient détruites.
     */
    public void run() {
        System.out.println(this);
        /*// Déplacement des fourmis
        while(nombreDeSources > 0){
            fourmis.stream().forEach((f) -> {
                f.deplacement();
            });
        }*/
    }

    /**
     * Détruit une source à la position indiquée.
     * @param x ligne de la source à détruire.
     * @param y colonne de la source à détruire.
     */
    public void detruireSource(int x, int y) {
        grille[x][y] = new Cellule_Vide(x, y);
        nombreDeSources -= 1;
    }

    /**
     * Constructeur
     * @param filename Juste le nom.txt, les cartes doivent être ranger dans src/Anthill/cartes.
     * @param nombreDeFourmis Nombre de fourmis à placer sur la carte.
     */
    public Environnement(String filename, int nombreDeFourmis) {
        Readfile reader = new Readfile();
        String texte = reader.read("src\\Anthill\\cartes\\" + filename);

        // Vérification de la carte fournie
        verifierDimensions(texte);
        verifierObstacles(texte);
        verifierFourmiliere(texte);
        verifierSource(texte);

        // Construction de la grille (matrice)
        grille = new Cellule[nombreDeLignes][nombreDeColonnes];

        int x = 0;
        int y = 0;

        for (int i = 0; i < texte.length(); i++) {
            switch (texte.charAt(i)) {
                case 'l':
                    x += 1;
                    y = -1;
                    break;
                case ' ':
                    grille[x][y] = new Cellule_Vide(x, y);
                    break;
                case '#':
                    grille[x][y] = new Obstacle(x, y);
                    break;
                case 'o':
                    grille[x][y] = new Source(x, y);
                    break;
                case 'x':
                    grille[x][y] = new Fourmiliere(x, y);
                    xFourmiliere = x;
                    yFourmiliere = y;
                    break;
                default:
                    break;
            }
            y += 1;
        }
        
        // Création des fourmis
        fourmis = new ArrayList<>(nombreDeFourmis);
        for (int i = 0; i < nombreDeFourmis; i++) {
            fourmis.add(new Fourmi(xFourmiliere, yFourmiliere, grille));
        }
    }
    
    /**
     * Vérifie si la carte fournie est bien un carré (même nombre de colonnes pour chaque lignes).
     * @param texte String à vérifier
     */
    private void verifierDimensions(String texte) {
        nombreDeLignes = 0;
        nombreDeColonnes = 0;
        int countColonnes = 0;

        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == 'l') {
                nombreDeLignes += 1;
                if (nombreDeColonnes == 0) {
                    nombreDeColonnes = countColonnes;
                }
                if (countColonnes != nombreDeColonnes) {
                    System.out.println("La carte n'est pas carrée.");
                    System.exit(-1);
                }
                countColonnes = 0;
            } else {
                countColonnes += 1;
            }
        }
    }

    /**
     * Vérifie si la carte fournie est bien bornée d'obstacles.
     * @param texte String à vérifier
     */
    private void verifierObstacles(String texte) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == 'l') {
                x += 1;
                y = 0;
                i++;
            }
            if (i < texte.length() && (x == 0 || y == 0 || x == nombreDeLignes - 1 || y == nombreDeColonnes - 1)
                    && texte.charAt(i) != '#') {
                System.out.println("La carte n'est pas bien bornée.");
                System.exit(1);
            }
            y += 1;
        }
    }

    /**
     * Vérifie si la carte fournie contient bien une seule fourmilière.
     * @param texte String à vérifier
     */
    private void verifierFourmiliere(String texte) {
        int count = 0;
        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == 'x') {
                count += 1;
            }
            if (count == 2) {
                System.out.println("La carte possède plus d'une fourmilière.");
                System.exit(2);
            }
        }
    }

    /**
     * Vérifie si la carte fournie contient au moins une source.
     * @param texte String à vérifier
     */
    private void verifierSource(String texte) {
        nombreDeSources = 0;
        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == 'o') {
                nombreDeSources += 1;
            }
        }
        if (nombreDeSources == 0) {
            System.out.println("La carte ne possède aucune source.");
            System.exit(3);
        }
    }

    /**
     * Renvoie la grille représentant la carte
     * @return 
     */
    public Cellule[][] getGrille() {
        return grille;
    }

    /**
     * Renvoie la ligne de la fourmilière
     * @return 
     */
    public int getxFourmiliere() {
        return xFourmiliere;
    }

    /**
     * Renvoie la colonne de la fourmilière
     * @return 
     */
    public int getyFourmiliere() {
        return yFourmiliere;
    }

    @Override
    public String toString() {
        String res = "";
        for (Cellule[] tc : grille) {
            for (Cellule c : tc) {
                res += c + " ";
            }
            res += "\n";
        }
        return res;
    }
}
