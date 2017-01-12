package Model;

/**
 *
 * @author nathan
 */
public class Fourmiliere extends Cellule {
    int nbFourmi, qteNourriture;
    
    public Fourmiliere(int x, int y, int n, int q){
        super(x,y);
        nbFourmi = n;
        qteNourriture = q;
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
