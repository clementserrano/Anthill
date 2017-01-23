package Anthill.model;

/**
 *
 * @author nathan
 */
public class Fourmiliere extends Cellule {
    private int qteNourriture;
    
    public Fourmiliere(int x, int y){
        super(x,y);
        qteNourriture = 0;
    }

    public int getQteNourriture() {
        return qteNourriture;
    }

    public void setQteNourriture(int qteNourriture) {
        this.qteNourriture = qteNourriture;
    }
    
    @Override
    public String toString() {
        return "x";
    }
}
