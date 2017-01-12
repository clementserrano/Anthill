package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author clementserrano
 */
public class Fourmi {
    int id;
    String etat;
    String direction;
    ArrayList<Point> chemin;
    Cellule[][] grille;
    
    public Fourmi(int id, Cellule[][] grille){
        this.id = id;
        this.etat = "recherche";
        this.direction = "N";
        this.chemin = new ArrayList<Point>();
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
    
    public void depotPheromone() {
        
    }
    
    public void deplacement(){
        
    }
    
    public void regarderAutour(Point p){
        HashMap<String, Cellule> hmap = new HashMap<String, Cellule>();
        hmap.put("N", grille[p.getX()][p.getY()-1]);
        hmap.put("NE", grille[p.getX()+1][p.getY()-1]);
        hmap.put("E", grille[p.getX()+1][p.getY()]);
        hmap.put("SE", grille[p.getX()+1][p.getY()+1]);
        hmap.put("S", grille[p.getX()][p.getY()+1]);
        hmap.put("SO", grille[p.getX()-1][p.getY()+1]);
        hmap.put("O", grille[p.getX()-1][p.getY()]);
        hmap.put("NO", grille[p.getX()-1][p.getY()-1]);
    }
    
}
