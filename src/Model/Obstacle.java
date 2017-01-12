package Model;

/**
 *
 * @author Inflo
 */
public class Obstacle extends Cellule {
    
    public Obstacle(int x, int y) {
        super(x, y);
    }
    
    @Override
    public String toString() {
        return "#";
    }
}
