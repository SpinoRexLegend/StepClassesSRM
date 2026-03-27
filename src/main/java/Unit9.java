import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unit9 {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public List<Bogie> createBogies() {
        Scanner sc = new Scanner(System.in);
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie name:");
            String name = sc.nextLine();
            System.out.println("Enter capacity:");
            int cap = sc.nextInt();
            sc.nextLine();
            bogies.add(new Bogie(name, cap));
        }
        return bogies;
    }

    public int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public void displayTotalSeats(int total) {
        System.out.println("Total Seating Capacity: " + total);
    }

    public void run() {
        List<Bogie> bogies = createBogies();
        int total = calculateTotalSeats(bogies);
        displayTotalSeats(total);
    }
}