package Anthill.model;

/**
 * Fourmilière d'où les fourmis partent
 * @author nathan
 */
public class Fourmiliere extends Cellule {
    private int qteNourriture;
    
    /**
     * Constructeur
     * @param x
     * @param y
     */
    public Fourmiliere(int x, int y){
        super(x,y);
        qteNourriture = 0;
    }

    /**
     * Renvoi la quantité de nourriture de la fourmilière
     * @return
     */
    public int getQteNourriture() {
        return qteNourriture;
    }
    
    /**
     * Incrémente la quantité de nourriture de la fourmilière de la valeur fournie
     * @param qteNourriture
     */
    public void addQteNourriture(int qteNourriture) {
        this.qteNourriture += qteNourriture;
    }
    
    @Override
    public String toString() {
        return "x";
    }
}
