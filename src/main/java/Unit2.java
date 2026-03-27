import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unit2 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Set<String> bogieIds = new HashSet<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie ID:");
            String id = sc.nextLine();
            bogieIds.add(id);
        }

        System.out.println("Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}