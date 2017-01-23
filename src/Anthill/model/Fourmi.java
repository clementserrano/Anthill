package Anthill.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author clementserrano
 */
public class Fourmi {

    private int x;
    private int y;
    private int qteNourriture;
    private String etat;
    private String direction;
    private ArrayList<int[]> chemin;
    private Cellule[][] grille;

    public Fourmi(int x, int y, Cellule[][] grille) {
        this.x = x;
        this.y = y;
        this.qteNourriture = 0;
        this.etat = "recherche";
        this.direction = "N";
        this.chemin = new ArrayList<int[]>();
        this.grille = grille;

    }

    public void depotPheromone() {

    }

    public void deplacement() {
        if(etat == "recherche"){
            
        }else if(etat == "retour"){
            
        }
    }

    public HashMap<String, Cellule> regarderAutour() {
        HashMap<String, Cellule> hmap = new HashMap<String, Cellule>();
        hmap.put("N", grille[x][y - 1]);
        hmap.put("NE", grille[x + 1][y - 1]);
        hmap.put("E", grille[x + 1][y]);
        hmap.put("SE", grille[x + 1][y + 1]);
        hmap.put("S", grille[x][y + 1]);
        hmap.put("SO", grille[x - 1][y + 1]);
        hmap.put("O", grille[x - 1][y]);
        hmap.put("NO", grille[x - 1][y - 1]);
        return hmap;
    }

    public void deciderDirection() {
        int c0 = 0, c1 = 5, c2 = 10, c3 = 20, c4 = 50, c5 = 20, c6 = 10, c7 = 5;
        int sommeC = c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7;
        int[] tableauDeCi = new int[sommeC];
        for (int i = 0; i < sommeC; i++) {
            if(i < c1){
                tableauDeCi[i] = c1;
            }
            else if(i < c2){
                tableauDeCi[i] = c2;
            }
            else if(i < c3){
                tableauDeCi[i] = c3;
            }
            else if(i < c4){
                tableauDeCi[i] = c4;
            }
            else if(i < c5){
                tableauDeCi[i] = c5;
            }
            else if(i < c6){
                tableauDeCi[i] = c6;
            }
            else if(i < c7){
                tableauDeCi[i] = c7;
            }
        }
        if (chemin.size() == 0) {

        }
        else{
            
        }
        
    }

}
