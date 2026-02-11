import UsernameProblem.UsernameChecker;
import UsernameProblem.UsernameResult;
import UsernameProblem.UsernameStore;
import UsernameProblem.UsernameSuggester;

public class Main {
    public static void main(String[] args) {
        UsernameStore store = new UsernameStore();
        UsernameSuggester suggester = new UsernameSuggester();
        UsernameChecker checker = new UsernameChecker(store, suggester);



        UsernameResult result1 = checker.check("Aritra");
        System.out.println("Available: " + result1.isAvailable());
        System.out.println("Popularity: " + result1.getPopularity());

        UsernameResult result2 = checker.check("Aritra");
        System.out.println("Available: " + result2.isAvailable());
        System.out.println("Suggestions: " + result2.getSuggestions());
        System.out.println("Popularity: " + result2.getPopularity());
    }
}