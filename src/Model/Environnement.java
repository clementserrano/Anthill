package Model;

/**
 *
 * @author clementserrano
 */
public class Environnement {
    private Cellule[][] grille;
    private Fourmi[] fourmis;

    public Environnement(int hauteur, int largeur){
        this.grille = new Cellule[hauteur][largeur];
        for(int i = 0; i < 3; i++ ){
            fourmis[i] = new Fourmi(i, grille);
        }
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
