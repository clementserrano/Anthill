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
    public static ImageIcon source = source();
    public static ImageIcon fourmiliere = fourmiliere();
    public static ImageIcon fourmi = fourmi();
    public static ImageIcon fourmi2 = fourmi2();
    public static ImageIcon fourmi3 = fourmi3();
    public static ImageIcon fourmi4 = fourmi4();
    public static ImageIcon fourmi5 = fourmi5();
    public static ImageIcon fourmiPlus = fourmiPlus();
    public static ImageIcon sourceFourmi = sourceFourmi();
    public static ImageIcon sourceFourmi2 = sourceFourmi2();
    public static ImageIcon sourceFourmi3 = sourceFourmi3();
    public static ImageIcon sourceFourmi4 = sourceFourmi4();
    public static ImageIcon sourceFourmi5 = sourceFourmi5();
    public static ImageIcon sourceFourmiPlus = sourceFourmiPlus();
    public static ImageIcon fourmiliereFourmi = fourmiliereFourmi();
    public static ImageIcon fourmiliereFourmi2 = fourmiliereFourmi2();
    public static ImageIcon fourmiliereFourmi3 = fourmiliereFourmi3();
    public static ImageIcon fourmiliereFourmi4 = fourmiliereFourmi4();
    public static ImageIcon fourmiliereFourmi5 = fourmiliereFourmi5();
    public static ImageIcon fourmiliereFourmiPlus = fourmiliereFourmiPlus();

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

    private static ImageIcon source() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "source.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliere() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliere.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmi() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmi.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmi2() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmi2.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmi3() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmi3.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmi4() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmi4.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmi5() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmi5.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiPlus() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiPlus.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmi() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmi.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmi2() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmi2.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmi3() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmi3.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmi4() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmi4.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmi5() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmi5.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon sourceFourmiPlus() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "sourceFourmiPlus.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmi() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmi.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmi2() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmi2.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmi3() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmi3.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmi4() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmi4.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmi5() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmi5.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ImageIcon fourmiliereFourmiPlus() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgPath + "fourmiliereFourmiPlus.png"));
            Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
