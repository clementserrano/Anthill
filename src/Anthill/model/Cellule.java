package Anthill.model;

/**
 * Cellule constituant la grille de l'environnement.
 *
 * @author clementserrano
 */
public abstract class Cellule {

    protected int x;
    protected int y;
    protected int nbFourmis;
    protected int qtePheromone;

    public Cellule(int x, int y) {
        this.x = x;
        this.y = y;
        nbFourmis = 0;
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
        nbFourmis++;
    }

    public void removeFourmi() {
        if (nbFourmis > 0) {
            nbFourmis--;
        }
    }

    public int getNbFourmis() {
        return nbFourmis;
    }

    public void addQtePheromone() {
        qtePheromone += 10;
    }

    public void removeQtePheromone() {
        if (qtePheromone > 0) {
            qtePheromone--;
        }
    }

}
