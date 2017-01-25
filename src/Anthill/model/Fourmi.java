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
    private Environnement e;
    private HashMap<String, Cellule> hmap;

    public Fourmi(int x, int y, Environnement e) {
        this.x = x;
        this.y = y;
        this.qteNourriture = 0;
        this.etat = "recherche";
        this.direction = "N";
        this.chemin = new ArrayList<>();
        int[] pos = {x, y};
        chemin.add(pos);
        this.e = e;

    }

    public void depotPheromone(int x, int y) {
        e.getGrille()[x][y].addQtePheromone();
    }

    public void deplacement() {
        if (etat == "recherche") {
            
            deplacerAller();
            int[] pos = {this.x, this.y};
            chemin.add(pos);

        } else if (etat == "retour" && chemin.size() > 1) {
            chemin.remove(chemin.size()-1);
            int x = chemin.get(chemin.size() - 1)[0];
            int y = chemin.get(chemin.size() - 1)[1];
            e.getGrille()[this.x][this.y].removeFourmi();
            this.x = x;
            this.y = y;
            e.getGrille()[this.x][this.y].addFourmi();
            depotPheromone(this.x, this.y);
            if (e.getGrille()[this.x][this.y] == e.getFourmiliere()) {
                e.getFourmiliere().addQteNourriture(this.qteNourriture);
                this.qteNourriture = 0;
                // La fourmi est rentrée
                etat = "recherche";
            }
        }
    }

    public HashMap<String, Cellule> regarderAutour() {
        hmap = new HashMap<>();
        Cellule[][] grille = e.getGrille();
        hmap.put("N", grille[x-1][y]);      // x = ligne (vers la droite), y = colonne(vers le bas)
        hmap.put("NE", grille[x-1][y + 1]);
        hmap.put("E", grille[x][y+1]);
        hmap.put("SE", grille[x + 1][y + 1]);
        hmap.put("S", grille[x+1][y]);
        hmap.put("SO", grille[x + 1][y - 1]);
        hmap.put("O", grille[x][y-1]);
        hmap.put("NO", grille[x - 1][y - 1]);
        return hmap;
    }

    public void deplacerAller() {

        regarderAutour();
        int p0, p1, p2, p3, p4, p5, p6, p7;             //qte phéromone
        int c0, c1, c2, c3, c4, c5, c6, c7;             //poids case
        c0 = c1 = c2 = c3 = c4 = c5 = c6 = c7 = 0;
        p0 = e.getGrille()[x+1][y].getQtePheromone();
        p1 = e.getGrille()[x + 1][y - 1].getQtePheromone();
        p2 = e.getGrille()[x][y-1].getQtePheromone();
        p3 = e.getGrille()[x - 1][y - 1].getQtePheromone();
        p4 = e.getGrille()[x-1][y].getQtePheromone();
        p5 = e.getGrille()[x - 1][y + 1].getQtePheromone();
        p6 = e.getGrille()[x][y+1].getQtePheromone();
        p7 = e.getGrille()[x + 1][y + 1].getQtePheromone();

        switch (this.direction) {
            case "N":
                c0 = 0;
                c1 = 5;
                c2 = 10;
                c3 = 20;
                c4 = 50;
                c5 = 20;
                c6 = 10;
                c7 = 5;
                break;

            case "NE":
                c0 = 5;
                c1 = 0;
                c2 = 5;
                c3 = 10;
                c4 = 20;
                c5 = 50;
                c6 = 20;
                c7 = 10;
                break;

            case "E":
                c0 = 10;
                c1 = 5;
                c2 = 0;
                c3 = 5;
                c4 = 10;
                c5 = 20;
                c6 = 50;
                c7 = 20;
                break;

            case "SE":
                c0 = 20;
                c1 = 10;
                c2 = 5;
                c3 = 0;
                c4 = 5;
                c5 = 10;
                c6 = 20;
                c7 = 50;
                break;

            case "S":
                c0 = 50;
                c1 = 20;
                c2 = 10;
                c3 = 5;
                c4 = 0;
                c5 = 5;
                c6 = 10;
                c7 = 20;
                break;

            case "SO":
                c0 = 20;
                c1 = 50;
                c2 = 20;
                c3 = 10;
                c4 = 5;
                c5 = 0;
                c6 = 5;
                c7 = 10;
                break;

            case "O":
                c0 = 10;
                c1 = 20;
                c2 = 50;
                c3 = 20;
                c4 = 10;
                c5 = 5;
                c6 = 0;
                c7 = 5;
                break;

            case "NO":
                c0 = 5;
                c1 = 10;
                c2 = 20;
                c3 = 50;
                c4 = 20;
                c5 = 10;
                c6 = 5;
                c7 = 0;
                break;
        }

        c0 += p0;
        c1 += p1;
        c2 += p2;
        c3 += p3;
        c4 += p4;
        c5 += p5;
        c6 += p6;
        c7 += p7;

        int sommeC = c0 + c1 + c2 + c3 + c4 + c5 + c6 + c7;
        String[] tableauDeCi = new String[sommeC];
        for (int i = 0; i < sommeC; i++) {
            if (i < c0) {
                tableauDeCi[i] = "S";
            }
            else if (i < c1 + c0) {
                tableauDeCi[i] = "SO";
            } else if (i < c2 + c1 + c0) {
                tableauDeCi[i] = "O";
            } else if (i < c3 + c2 + c1 + c0) {
                tableauDeCi[i] = "NO";
            } else if (i < c4 + c3 + c2 + c1 + c0) {
                tableauDeCi[i] = "N";
            } else if (i < c5 + c4 + c3 + c2 + c1 + c0) {
                tableauDeCi[i] = "NE";
            } else if (i < c6 + c5 + c4 + c3 + c2 + c1 + c0) {
                tableauDeCi[i] = "E";
            } else if (i < c7 + c6 + c5 + c4 + c3 + c2 + c1 + c0) {
                tableauDeCi[i] = "SE";
            }
        }
        
        
        Cellule cell;
        String nouvDir;
        int essais = 0;
        do {
            int rdm = (int) (Math.random() * (sommeC));
            /*for(int i = 0; i<tableauDeCi.length; i++){
                System.out.print(tableauDeCi[i] + " ");
            }*/
            essais ++;
            nouvDir = tableauDeCi[rdm];
            cell = hmap.get(nouvDir);
            
            //System.out.println("\n" +rdm+" "+nouvDir);
        } while (cell instanceof Obstacle && essais < 500);
        if(essais >= 500){
            this.direction = this.demiTour();
            cell = hmap.get(this.direction);
        }
        else{
            this.direction = nouvDir;
        }
        
        e.getGrille()[this.x][this.y].removeFourmi();

        this.x = cell.getX();
        this.y = cell.getY();
        
        cell.addFourmi();

        if (cell instanceof Source) {
            Source s;
            s = (Source) cell;
            s.diminuerNourriture(e);
            this.qteNourriture += 1;
            this.etat = "retour";
        }
        
        
    }
    
    private void deplacerDijkstra(){
        
    }

    private String demiTour() {
        switch(this.direction){
            case "N": return "S"; case "NE": return "SO"; case "E": return "O"; case "SE": return "NO";
            case "S": return "N"; case "SO": return "NE"; case "O": return "E"; case "NO": return "SE";
        }
        return null;
    }

}
