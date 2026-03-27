import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unit4 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Set<String> bogies = new LinkedHashSet<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie:");
            String b = sc.nextLine();
            bogies.add(b);
        }

        System.out.println("Train Formation:");
        for (String b : bogies) {
            System.out.println(b);
        }
    }
}