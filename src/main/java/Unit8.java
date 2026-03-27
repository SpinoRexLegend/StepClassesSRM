import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Unit8 {
    static class Bogie {
        String type;
        String name;
        int capacity;

        Bogie(String type, String name, int capacity) {
            this.type = type;
            this.name = name;
            this.capacity = capacity;
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie type (Passenger/Goods):");
            String type = sc.nextLine();
            System.out.println("Enter bogie name:");
            String name = sc.nextLine();
            System.out.println("Enter capacity:");
            int cap = sc.nextInt();
            sc.nextLine();
            bogies.add(new Bogie(type, name, cap));
        }

        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("Grouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b.name + " -> " + b.capacity);
            }
        }
    }
}
