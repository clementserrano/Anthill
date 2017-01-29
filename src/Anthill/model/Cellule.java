package Anthill.model;

/**
 * Cellule constituant la grille de l'environnement.
 *
 * @author clementserrano
 */
public abstract class Cellule {

    /**
     * Numéro de la ligne de la cellule
     */
    protected int x;

    /**
     * Numéro de la colonne de la cellule
     */
    protected int y;

    /**
     * Nombre de fourmis dans la cellule
     */
    protected int nbFourmis;

    /**
     * Quantité de phéromones dans la cellule
     */
    protected int qtePheromone;

    /**
     * Constructeur de la cellule
     *
     * @param x Numéro de la ligne de la cellule
     * @param y Numéro de la colonne de la cellule
     */
    public Cellule(int x, int y) {
        this.x = x;
        this.y = y;
        nbFourmis = 0;
        qtePheromone = 0;
    }

    /**
     * Renvoie le numéro de la ligne de la cellule
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * Change le numéro de la ligne de la cellule
     *
     * @param x nouveau numéro de la ligne
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Renvoie le numéro de la colonne de la cellule
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * Change le numéro de la colonne de la cellule
     *
     * @param y nouveau numéro de la colonne
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Renvoie la quantité de phéromones de la cellule
     *
     * @return
     */
    public int getQtePheromone() {
        return (qtePheromone);
    }

    /**
     * Renvoie un espace pour une Cellule
     *
     * @return un espace
     */
    @Override
    public String toString() {
        return " ";
    }

    /**
     * Incrémente le nombre de fourmis de 1
     */
    public void addFourmi() {
        nbFourmis++;
    }

    /**
     * Décrémente le nombre de fourmis de 1 si ce nombre est > 0
     */
    public void removeFourmi() {
        if (nbFourmis > 0) {
            nbFourmis--;
        }
    }

    /**
     * Renvoie le nombre de fourmis dans la cellule
     *
     * @return le nombre de fourmis dans la cellule
     */
    public int getNbFourmis() {
        return nbFourmis;
    }

    /**
     * Incrémente la quantité de phéromones dans la cellule de 10
     */
    public void addQtePheromone() {
        qtePheromone += 10;
    }

    /**
     * Décrémente la quantité de phéromones dans la cellule de 1 si elle est > 0
     */
    public void removeQtePheromone() {
        if (qtePheromone > 0) {
            qtePheromone--;
        }
    }

}
