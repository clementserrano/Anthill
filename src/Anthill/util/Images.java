/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anthill.util;

import Anthill.model.Cellule;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author clementserrano
 */
public class Images {

    private static String imgPath = "src/Anthill/ressources/img/";
    public static ImageIcon source = getImage("source");
    public static ImageIcon fourmiliere = getImage("fourmiliere");
    public static ImageIcon fourmi = getImage("fourmi");
    public static ImageIcon fourmi2 = getImage("fourmi2");
    public static ImageIcon fourmi3 = getImage("fourmi3");
    public static ImageIcon fourmi4 = getImage("fourmi4");
    public static ImageIcon fourmi5 = getImage("fourmi5");
    public static ImageIcon fourmiPlus = getImage("fourmiPlus");
    public static ImageIcon sourceFourmi = getImage("sourceFourmi");
    public static ImageIcon sourceFourmi2 = getImage("sourceFourmi2");
    public static ImageIcon sourceFourmi3 = getImage("sourceFourmi3");
    public static ImageIcon sourceFourmi4 = getImage("sourceFourmi4");
    public static ImageIcon sourceFourmi5 = getImage("sourceFourmi5");
    public static ImageIcon sourceFourmiPlus = getImage("sourceFourmiPlus");
    public static ImageIcon fourmiliereFourmi = getImage("fourmiliereFourmi");
    public static ImageIcon fourmiliereFourmi2 = getImage("fourmiliereFourmi2");
    public static ImageIcon fourmiliereFourmi3 = getImage("fourmiliereFourmi3");
    public static ImageIcon fourmiliereFourmi4 = getImage("fourmiliereFourmi4");
    public static ImageIcon fourmiliereFourmi5 = getImage("fourmiliereFourmi5");
    public static ImageIcon fourmiliereFourmiPlus = getImage("fourmiliereFourmiPlus");

    public static void source(JLabel label, Cellule cellule) {
        switch (cellule.getNbFourmis()) {
            case 0:
                label.setIcon(source);
                break;
            case 1:
                label.setIcon(sourceFourmi);
                break;
            case 2:
                label.setIcon(sourceFourmi2);
                break;
            case 3:
                label.setIcon(sourceFourmi3);
                break;
            case 4:
                label.setIcon(sourceFourmi4);
                break;
            case 5:
                label.setIcon(sourceFourmi5);
                break;
            default:
                label.setIcon(sourceFourmiPlus);
                break;
        }
    }

    public static void fourmiliere(JLabel label, Cellule cellule) {
        switch (cellule.getNbFourmis()) {
            case 0:
                label.setIcon(fourmiliere);
                break;
            case 1:
                label.setIcon(fourmiliereFourmi);
                break;
            case 2:
                label.setIcon(fourmiliereFourmi2);
                break;
            case 3:
                label.setIcon(fourmiliereFourmi3);
                break;
            case 4:
                label.setIcon(fourmiliereFourmi4);
                break;
            case 5:
                label.setIcon(fourmiliereFourmi5);
                break;
            default:
                label.setIcon(fourmiliereFourmiPlus);
                break;
        }
    }

    public static void cellule_vide(JLabel label, Cellule cellule) {
        switch (cellule.getNbFourmis()) {
            case 0:
                label.setIcon(null);
                break;
            case 1:
                label.setIcon(Images.fourmi);
                break;
            case 2:
                label.setIcon(Images.fourmi2);
                break;
            case 3:
                label.setIcon(Images.fourmi3);
                break;
            case 4:
                label.setIcon(Images.fourmi4);
                break;
            case 5:
                label.setIcon(Images.fourmi5);
                break;
            default:
                label.setIcon(Images.fourmiPlus);
                break;
        }
    }

    private static ImageIcon getImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + name + ".png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
