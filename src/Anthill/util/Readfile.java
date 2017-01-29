package Anthill.util;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Permet de lire un fichier
 * @author chris
 */
public class Readfile {

    /**
     * Lit le fichier ligne par ligne et renvoit un String avec un 'l' séparant chaque ligne
     * @param fichier
     * @return
     */
    public String read(String fichier){
        String res = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader(fichier));
            String line;
            while ((line = in.readLine()) != null) {
                res += line+'l';
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(-2);
        }
        return res;
    }
}