package Model;

/**
 *
 * @author nathan
 */
public class Fourmiliere {
    int nbFourmi, qteNourriture;
    
    public Fourmiliere(int n, int q){
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
    
    
}
