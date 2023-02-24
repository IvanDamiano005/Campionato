import campionato.Campionato;
import java.time.LocalDate;

/**
 *
 * @author Perre
 */
public class Classifica {
    public static void main(String[] args){
        LocalDate myObj1 = LocalDate.now();
        LocalDate myObj2 = LocalDate.now();
        LocalDate myObj3 = LocalDate.now();
        Campionato c1 = new Campionato('A', 1, myObj1 , "juventus", "napoli", 3, 1);
        Campionato c2 = new Campionato('A', 1, myObj2, "roma", "pistoiese", 0, 2);
        Campionato c3 = new Campionato('A', 1, myObj3, "milan", "inter", 2, 1);
        System.out.println(c1.toString());
    }
}