public class CaseSensitiveApproach {
    private String input;

    public CaseSensitiveApproach(String input) {
        this.input = input.replaceAll("\\s+", "").toLowerCase();
    }

    public Boolean isPalindrome() {
        return check(0, input.length() - 1);
    }

    private Boolean check(int left, int right) {
        if (left >= right) return true;
        if (input.charAt(left) != input.charAt(right)) return false;
        return check(left + 1, right - 1);
    }
}
