public class PerformanceMeasure {

    public static void measure(String label, String input, PalindromeStrategy strategy) {
        long start = System.nanoTime();
        Boolean result = strategy.check(input);
        long end = System.nanoTime();
        System.out.println(label + " | Input: " + input + " | Result: " + result + " | Time(ns): " + (end - start));
    }

    public static Boolean simpleCheck(String input) {
        return recursiveCheck(input, 0, input.length() - 1);
    }

    public static Boolean caseInsensitiveCheck(String input) {
        String normalized = input.toLowerCase();
        return recursiveCheck(normalized, 0, normalized.length() - 1);
    }

    public static Boolean spaceIgnoredCheck(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(normalized, 0, normalized.length() - 1);
    }

    private static Boolean recursiveCheck(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return recursiveCheck(s, left + 1, right - 1);
    }

    public interface PalindromeStrategy {
        Boolean check(String input);
    }
}
