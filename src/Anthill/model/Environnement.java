package Anthill.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author clementserrano
 */
public class Environnement {
    private Cellule[][] grille;
    private ArrayList<Fourmi> fourmis;
    private int nbFourmis;
    private int nbSources;
    private int nbObstacles;

    public Environnement(int hauteur, int largeur, int nbFourmis, int nbSources, int nbObstacles){
        this.nbFourmis = nbFourmis;
        this.nbSources = nbSources;
        this.nbObstacles = nbObstacles;

        // On crée la grille en la bornant d'obstacles
        grille = new Cellule[hauteur][largeur];
        for (int i = 0; i < grille.length; i++){
            for (int j = 0; j < grille[i].length ; j++){
                if(i==0 || j == 0 || i == grille.length-1 || j == grille[i].length-1){
                    grille[i][j] = new Obstacle(i,j);
                }else{
                    grille[i][j] = new Cellule_Vide(i,j);
                }
            }
        }
        
        // On place la fourmilière 
        int xFourmiliere = ThreadLocalRandom.current().nextInt(1, grille.length -2 + 1);
        int yFourmiliere = ThreadLocalRandom.current().nextInt(1, grille[0].length -2 + 1);
        grille[xFourmiliere][yFourmiliere] = new Fourmiliere(xFourmiliere,yFourmiliere,nbFourmis);
        
        /*// On place les fourmis
        fourmis = new ArrayList<Fourmi>();
        for(int i = 0; i < nbFourmis; i++ ){
            fourmis.add(new Fourmi(i, xFourmiliere, yFourmiliere, grille));
        }*/
        
        // On place les sources
        for(int i =0; i<nbSources; i++){
            int xSource = ThreadLocalRandom.current().nextInt(1, grille.length -2 + 1);
            int ySource = ThreadLocalRandom.current().nextInt(1, grille[0].length -2 + 1);
        
            while(!grille[xSource][ySource].toString().equals(" ")){
                xSource = ThreadLocalRandom.current().nextInt(1, grille.length -2 + 1);
                ySource = ThreadLocalRandom.current().nextInt(1, grille[0].length -2 + 1);
            }
            grille[xSource][ySource] = new Source(xSource,ySource);
        }
        
        // On place les obstacles
        for(int i =0; i<nbObstacles; i++){
            int xObstacle = ThreadLocalRandom.current().nextInt(1, grille.length -2 + 1);
            int yObstacle = ThreadLocalRandom.current().nextInt(1, grille[0].length -2 + 1);
        
            while(!grille[xObstacle][yObstacle].toString().equals(" ")){
                xObstacle = ThreadLocalRandom.current().nextInt(1, grille.length -2 + 1);
                yObstacle = ThreadLocalRandom.current().nextInt(1, grille[0].length -2 + 1);
            }
            grille[xObstacle][yObstacle] = new Obstacle(xObstacle,yObstacle);
        }
        
        
    }
    
    public Cellule[][] getGrille() {
        return grille;
    }
    
    public void run(){
        System.out.println(this);
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
    
    public void detruireSource(){
        
    }
    
}
