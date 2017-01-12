package Model;

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
    
    public void detruire(){
        
    }
    
    @Override
    public String toString() {
        return "o";
    }
}
