import java.util.ArrayList;
import java.util.List;

public class Unit1 {
    static void run() {
        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("After adding: " + bogies);
        bogies.remove("AC Chair");
        System.out.println("After removing: " + bogies);
        System.out.println("Sleeper exists: " + bogies.contains("Sleeper"));
        System.out.println("Final list: " + bogies);
        //No comment, class Unit2, easy readable simple variables, no main method
        //No hardcoded value, only user input values
        //Write separate functions please
    }
}
