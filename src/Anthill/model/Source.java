package Anthill.model;

/**
 * Source contenant la nourriture que cherchent les fourmis
 * @author Inflo
 */
public class Source extends Cellule {
    private int qteNourriture;

    /**
     * Constructeur
     * @param x
     * @param y
     */
    public Source(int x, int y){
        super(x,y);
    }

    /**
     * Renvoi la quantité de nourriture de la source
     * @return
     */
    public int getQteNourriture() {
        return qteNourriture;
    }

    /**
     * Modifie la quantité de nourriture de la source
     * @param qteNourriture
     */
    public void setQteNourriture(int qteNourriture) {
        this.qteNourriture = qteNourriture;
    }
    
    /**
     * Décrémente la quantité de nourriture de la source de 1
     * @param e
     */
    public void diminuerNourriture(Environnement e) {
        this.qteNourriture --;
        if(this.qteNourriture == 0){
            e.detruireSource(this.x, this.y);
        }
    }
    
    @Override
    public String toString() {
        return "o";
    }
}
