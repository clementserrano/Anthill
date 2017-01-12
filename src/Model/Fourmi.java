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
        hmap.put("Nord", grille[p.getX()][p.getY()-1]);
        hmap.put("Nord-Est", grille[p.getX()+1][p.getY()-1]);
        hmap.put("Est", grille[p.getX()+1][p.getY()]);
        hmap.put("Sud-Est", grille[p.getX()+1][p.getY()+1]);
        hmap.put("Sud", grille[p.getX()][p.getY()+1]);
        hmap.put("Sud-Ouest", grille[p.getX()-1][p.getY()+1]);
        hmap.put("Ouest", grille[p.getX()-1][p.getY()]);
        hmap.put("Nord-Ouest", grille[p.getX()-1][p.getY()-1]);
    }
    
}
