package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author clementserrano
 */
public class Program {

    public static void main(String[] args) throws IOException {

        Readfile level = new Readfile();
        level.Read("test.txt");
        
        Environnement evt = new Environnement(9,9,3,1,5);
        evt.run();
    }
}
