package Anthill.model;

/**
 * Cellule constituant la grille de l'environnement.
 *
 * @author clementserrano
 */
public class Cellule {

    protected int x;
    protected int y;
    protected int nbrFourmi;
    protected int qtePheromone;

    public Cellule(int x, int y) {
        this.x = x;
        this.y = y;
        nbrFourmi = 0;
        qtePheromone = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQtePheromone() {
        return (qtePheromone);
    }

    @Override
    public String toString() {
        return " ";
    }

    public void addFourmi() {
        nbrFourmi++;
    }

    public void removeFourmi() {
        if (nbrFourmi > 0) {
            nbrFourmi--;
        }
    }

    public int getNbrFourmi() {
        return nbrFourmi;
    }

    public void addQtePheromone() {
        qtePheromone += 2;
    }

    public void removeQtePheromone() {
        if (qtePheromone > 0) {
            qtePheromone--;
        }
    }

}
