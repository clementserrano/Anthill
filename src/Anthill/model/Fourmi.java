package Anthill.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author clementserrano
 */
public class Fourmi {
    int id;
    int x;
    int y;
    String etat;
    String direction;
    ArrayList<int[]> chemin;
    Cellule[][] grille;
    
    public Fourmi(int id, int x, int y, Cellule[][] grille){
        this.id = id;
        this.x=x;
        this.y=y;
        this.etat = "recherche";
        this.direction = "N";
        this.chemin = new ArrayList<int[]>();
        this.grille = grille;
        
    }

    public int getId() {
        return id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDirection() {
        return direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public int getX(){
        return(x);
    }
    
    public int getY(){
        return(y);
    }
    
    public void depotPheromone() {
        
    }
    
    public void deplacement(){
        
    }
    
    public HashMap<String, Cellule> regarderAutour(){
        HashMap<String, Cellule> hmap = new HashMap<String, Cellule>();
        hmap.put("N", grille[x][y-1]);
        hmap.put("NE", grille[x+1][y-1]);
        hmap.put("E", grille[x+1][y]);
        hmap.put("SE", grille[x+1][y+1]);
        hmap.put("S", grille[x][y+1]);
        hmap.put("SO", grille[x-1][y+1]);
        hmap.put("O", grille[x-1][y]);
        hmap.put("NO", grille[x-1][y-1]);
        return hmap;
    }
    
    public void deciderDirection(){
        int c0 = 0, c1 = 5, c2 = 10, c3 = 20 , c4 = 50 , c5 = 20, c6 = 10, c7 = 5;
        int sommeC = c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7;
        int[] tableauDeCi;
        for(int i = 0; i < sommeC; i++){
            
        }
        if(chemin.size() == 0){
            
        }
    }
    
}
