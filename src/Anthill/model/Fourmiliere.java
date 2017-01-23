package Anthill.model;

/**
 *
 * @author nathan
 */
public class Fourmiliere extends Cellule {
    private int nbFourmi;
    private int qteNourriture;
    
    public Fourmiliere(int x, int y){
        super(x,y);
        nbFourmi = 0;
        qteNourriture = 0;
    }

    public int getNbFourmi() {
        return nbFourmi;
    }

    public int getQteNourriture() {
        return qteNourriture;
    }

    public void setNbFourmi(int nbFourmi) {
        this.nbFourmi = nbFourmi;
    }

    public void setQteNourriture(int qteNourriture) {
        this.qteNourriture = qteNourriture;
    }
    
    @Override
    public String toString() {
        return "x";
    }
}
