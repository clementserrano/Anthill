package Anthill.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chris
 */
public class Readfile {

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