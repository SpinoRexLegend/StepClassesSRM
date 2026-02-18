import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker management system");
        System.out.println("Version: 1.0");
        System.out.println("System initiated successfully");

        HardcodedPalindrome hard = new HardcodedPalindrome();
        System.out.println("Please enter a string u wanna check");

        StringReverse rev = new StringReverse();

        System.out.println(hard.uc2(sc.nextLine()));
        System.out.println("The reversed part is "+rev.uc3(sc.nextLine()));

    }
}