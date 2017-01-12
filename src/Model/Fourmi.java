package Model;

import java.util.ArrayList;

/**
 *
 * @author clementserrano
 */
public class Fourmi {
    int id;
    String etat;
    String direction;
    ArrayList<Point> chemin;
    
    public Fourmi(int id){
        this.id = id;
        this.etat = "recherche";
        this.direction = "N";
        this.chemin = new ArrayList<Point>();
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
    
    public void regarderAutour(){
        
    }
    
}
