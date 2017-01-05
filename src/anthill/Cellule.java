package anthill;

import java.util.ArrayList;

public class Cellule {
    private int x;
    private int y;
    private ArrayList<Fourmi> fourmis;
    public Cellule(){
        x = 0;
        y = 0;
        fourmis = new ArrayList<Fourmi>();
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

    public ArrayList<Fourmi> getFourmis() {
        return fourmis;
    }    
}
