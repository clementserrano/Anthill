package Anthill.model;

import java.util.ArrayList;

/**
 *
 * @author clementserrano
 */
public class Cellule {
    private int x;
    private int y;
    private ArrayList<Fourmi> fourmis;
    private int qtePheromone;
    
    public Cellule(int x, int y){
        this.x = x;
        this.y = y;
        fourmis = new ArrayList<Fourmi>();
        qtePheromone = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getqtePheromone(){
        return(qtePheromone);
    }

    public ArrayList<Fourmi> getFourmis() {
        return fourmis;
    }  

    @Override
    public String toString() {
        return " ";
    }
    
}
