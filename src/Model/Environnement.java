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
        for (int i = 0; i < grille.length; i++){
            for (int j = 0; j < grille[i].length ; j++){
                if(i==0 || j == 0 || i == grille.length-1 ){
                    grille[i][j] = new Obstacle(i,j);
                }
            }
        }
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
