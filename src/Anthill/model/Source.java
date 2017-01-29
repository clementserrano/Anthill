package Anthill.model;

/**
 *
 * @author Inflo
 */
public class Source extends Cellule {
    private int qteNourriture;
    public Source(int x, int y){
        super(x,y);
    }

    public int getQteNourriture() {
        return qteNourriture;
    }

    public void setQteNourriture(int qteNourriture) {
        this.qteNourriture = qteNourriture;
    }
    
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
