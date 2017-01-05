package Model;

import java.util.ArrayList;

public class Cellule {
    private int x;
    private int y;
    private ArrayList<Fourmi> fourmis;
    private int qtePheromone;
    
    public Cellule(){
        x = 0;
        y = 0;
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
}
