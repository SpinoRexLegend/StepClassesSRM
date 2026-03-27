import java.util.LinkedList;
import java.util.Scanner;

public class Unit3 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> bogies = new LinkedList<>();

        System.out.println("Enter number of bogies:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bogie:");
            String b = sc.nextLine();
            bogies.add(b);
        }

        System.out.println("Enter bogie to insert at position 2:");
        String insertBogie = sc.nextLine();
        bogies.add(2, insertBogie);

        bogies.removeFirst();
        bogies.removeLast();

        System.out.println("Final Train Consist:");
        for (String b : bogies) {
            System.out.println(b);
        }
    }
}