import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker management system");
        System.out.println("Version: 1.0");
        System.out.println("System initiated successfully");

        HardcodedPalindrome hard = new HardcodedPalindrome();
        System.out.println("Please enter a string u wanna check:\n");

        StringReverse rev = new StringReverse();
        StackBased mriganka = new StackBased();
        QueueAndStackApproach prity = new QueueAndStackApproach();
        DequeBasedApproach poulami = new DequeBasedApproach();

        String sem = sc.nextLine();

        System.out.println(hard.uc2(sem));
        System.out.println("The reversed part is "+rev.uc3(sem));
        System.out.println("The stack based is: "+ mriganka.isPalindromeButWIthStack(sem));
        System.out.println("The queue and stack based approach is: "+ prity.isPalindrome(sem));
        System.out.println("The deque based approach is: "+ poulami.isPalindrome(sem));

    }
}