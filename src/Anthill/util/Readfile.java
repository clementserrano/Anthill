package Anthill.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chris
 */
public class Readfile {

    public Readfile() {
    }

    //   public Readfile(String nomFichier) { }
    public void Read(String fichier) throws IOException {

        try ( //Environnement evt = new Environnement(9,9);
                //evt.run();
                BufferedReader in = new BufferedReader(new FileReader(fichier))) {
                String line;
                while ((line = in.readLine()) != null) {
                    // Afficher le contenu du fichier
                    System.out.println(line);
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
