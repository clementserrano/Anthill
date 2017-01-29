/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Anthill.util;

import Anthill.model.Environnement;

/**
 *
 * @author clementserrano
 */
public class Taille {
    private static Environnement e;
    public static int hauteur;
    public static int largeur;
    
    private static int hauteur(){
        int hauteur = 30;
        if(e.getGrille().length>25){
            hauteur = 8;
        }else if(e.getGrille().length>50){
            hauteur = 3;
        }
        return hauteur;
    }
    
    private static int largeur(){
        int largeur = 30;
        if(e.getGrille()[0].length>25){
            largeur = 8;
        }else if(e.getGrille()[0].length>50){
            largeur = 3;
        }
        return largeur;
    }
    
    public static void setEnvironnement(Environnement environnement){
        e=environnement;
        hauteur = hauteur();
        largeur = largeur();
    }
}
