package Anthill;
import Anthill.model.Environnement;
import Anthill.util.Readfile;
import java.io.IOException;

/**
 *
 * @author clementserrano
 */
public class Program {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir" ));
        Readfile level = new Readfile();
        level.Read("src\\Anthill\\util\\test.txt");
        Environnement evt = new Environnement(9,9,3,1,5);
        evt.run();
    }
}
