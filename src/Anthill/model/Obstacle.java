package Anthill.model;

/**
 * Obstacle sur lequel les fourmis ne peuvent accéder
 * @author Inflo
 */
public class Obstacle extends Cellule {
    
    /**
     * Constructeur
     * @param x
     * @param y
     */
    public Obstacle(int x, int y) {
        super(x, y);
    }
    
    @Override
    public String toString() {
        return "#";
    }
}
