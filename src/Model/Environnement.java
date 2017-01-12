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
        String res = "";
        for(Cellule[] tc : grille){
            for(Cellule c : tc){
                res += c+" ";
            }
            res += "\n";
        }
        return res;
    }
    
    public void detruireSource(Point p){
        
    }
    
}
