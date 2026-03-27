import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unit5 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> bogies = new HashMap<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie name:");
            String name = sc.nextLine();
            System.out.println("Enter capacity:");
            int cap = sc.nextInt();
            sc.nextLine();
            bogies.put(name, cap);
        }

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}