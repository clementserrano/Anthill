package Anthill.model;

import Anthill.util.Readfile;
import Anthill.view.GUI;
import java.util.ArrayList;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

/**
 * Environnement représentant une carte où vont s'effectuer des déplacements de
 * fourmis.
 *
 * @author clementserrano
 */
public class Environnement {

    private Cellule[][] grille;
    private int nombreDeLignes;
    private int nombreDeColonnes;
    private int nombreDeSources;
    private int totalNourriture;
    private int timeSleep;
    private Fourmiliere fourmiliere;
    private ArrayList<Source> sources;
    private ArrayList<Fourmi> fourmis;
    private GUI observateur;

    /**
     * Constructeur
     *
     * @param filename Juste le nom.txt, les cartes doivent être ranger dans
     * src/Anthill/cartes.
     * @param nbFourmis
     * @param timeSleep
     */
    public Environnement(String filename, int nbFourmis, int timeSleep) {
        this.timeSleep = timeSleep;
        
        Readfile reader = new Readfile();
        String texte = reader.read("src/Anthill/ressources/cartes/" + filename);

        // Vérification de la carte fournie
        verifierDimensions(texte);
        verifierObstacles(texte);
        verifierFourmiliere(texte);
        verifierSource(texte);

        // Construction de la grille (matrice)
        grille = new Cellule[nombreDeLignes][nombreDeColonnes];

        int x = 0;
        int y = 0;
        totalNourriture = 0;
        sources = new ArrayList<>();

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
                    Source s = new Source(x, y);
                    sources.add(s);
                    totalNourriture += s.getQteNourriture();
                    grille[x][y] = s;
                    break;
                case 'x':
                    grille[x][y] = new Fourmiliere(x, y);
                    fourmiliere = (Fourmiliere) grille[x][y];
                    break;
                default:
                    break;
            }
            y += 1;
        }
        
        verifierPossibilite();

        // Création des fourmis
        fourmis = new ArrayList<>(nbFourmis);
        for (int i = 0; i < nbFourmis; i++) {
            fourmis.add(new Fourmi(fourmiliere.getX(), fourmiliere.getY(), this));
        }
    }

    /**
     * Fait déplacer les fourmis jusqu'à que toute la nourriture se trouve dans
     * la forumilière.
     */
    public void run() {
        // Déplacement des fourmis
        while (fourmiliere.getQteNourriture() != totalNourriture) {
            fourmis.stream().forEach((f) -> {
                f.deplacement();
            });
            diminuerPheromone();
            notifierObservateur();
            try{sleep(timeSleep);}catch(Exception e){}
        }
    }
    
    /**
     * Vérifie si la carte fournie est bien un carré (même nombre de colonnes
     * pour chaque lignes).
     *
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
                    JOptionPane.showMessageDialog(null, "La carte n'est pas rectangulaire");
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
     *
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
                JOptionPane.showMessageDialog(null, "La carte n'est pas bien bornée");
                System.exit(1);
            }
            y += 1;
        }
    }

    /**
     * Vérifie si la carte fournie contient bien une seule fourmilière.
     *
     * @param texte String à vérifier
     */
    private void verifierFourmiliere(String texte) {
        int count = 0;
        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == 'x') {
                count += 1;
            }
            if (count == 2) {
                JOptionPane.showMessageDialog(null, "La carte possède plus d'une fourmilière");
                System.exit(2);
            }
        }
    }

    /**
     * Vérifie si la carte fournie contient au moins une source.
     *
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
            JOptionPane.showMessageDialog(null, "La carte ne possède aucune source");
            System.exit(3);
        }
    }
    
    private void verifierPossibilite(){
        sources.stream().forEach((s) -> {
            Fourmi f = new Fourmi(fourmiliere.getX(),fourmiliere.getY(),this);
            
        });
    }
    
    /**
     * Détruit une source à la position indiquée.
     *
     * @param x ligne de la source à détruire.
     * @param y colonne de la source à détruire.
     */
    public void detruireSource(int x, int y) {
        grille[x][y] = new Cellule_Vide(x, y);
        nombreDeSources -= 1;
    } 

    /**
     * Diminue les pheromones de toutes les cellules
     */
    public void diminuerPheromone() {
        for (Cellule[] tc : grille) {
            for (Cellule c : tc) {
                c.removeQtePheromone();
            }
        }
    }

    public void notifierObservateur() {
        observateur.update();
    }

    /**
     * Renvoie la grille représentant la carte
     *
     * @return
     */
    public Cellule[][] getGrille() {
        return grille;
    }

    /**
     * Renvoie la fourmiliere
     *
     * @return
     */
    public Fourmiliere getFourmiliere() {
        return fourmiliere;
    }    
    
    public void setObservateur(GUI observateur) {
        this.observateur = observateur;
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
