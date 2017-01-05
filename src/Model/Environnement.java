package Model;

/**
 *
 * @author clementserrano
 */
public class Environnement {
    private Cellule[][] grille;

    public Environnement(){
        this.grille = new Cellule[6][3];
    }
    
    public Cellule[][] getGrille() {
        return grille;
    }
    
    public void run(){
        // do something
    }

    @Override
    public String toString() {
        return "beaucoup de choses";
    }
    
    public void detruireSource(Point p){
        
    }
    
}
