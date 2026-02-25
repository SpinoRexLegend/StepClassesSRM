public class AdvancedPalindromeChecker {

    private PalindromeStrategy strategy;
    private String input;

    public AdvancedPalindromeChecker(String input, PalindromeStrategy strategy) {
        this.input = input;
        this.strategy = strategy;
    }

    public Boolean isPalindrome() {
        return strategy.check(input);
    }

    public static void main(String[] args) {
        AdvancedPalindromeChecker checker1 = new AdvancedPalindromeChecker("madam", new SimplePalindromeStrategy());
        System.out.println(checker1.isPalindrome()); // true

        AdvancedPalindromeChecker checker2 = new AdvancedPalindromeChecker("RaceCar", new CaseInsensitivePalindromeStrategy());
        System.out.println(checker2.isPalindrome()); // true

        AdvancedPalindromeChecker checker3 = new AdvancedPalindromeChecker("A man a plan a canal Panama", new SpaceIgnoredPalindromeStrategy());
        System.out.println(checker3.isPalindrome()); // true
    }
}

interface PalindromeStrategy {
    Boolean check(String input);
}

class SimplePalindromeStrategy implements PalindromeStrategy {
    public Boolean check(String input) {
        return recursiveCheck(input, 0, input.length() - 1);
    }
    private Boolean recursiveCheck(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return recursiveCheck(s, left + 1, right - 1);
    }
}

class CaseInsensitivePalindromeStrategy implements PalindromeStrategy {
    public Boolean check(String input) {
        String normalized = input.toLowerCase();
        return recursiveCheck(normalized, 0, normalized.length() - 1);
    }
    private Boolean recursiveCheck(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return recursiveCheck(s, left + 1, right - 1);
    }
}

class SpaceIgnoredPalindromeStrategy implements PalindromeStrategy {
    public Boolean check(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(normalized, 0, normalized.length() - 1);
    }
    private Boolean recursiveCheck(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return recursiveCheck(s, left + 1, right - 1);
    }
}