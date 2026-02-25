public class RecursiveApproach {
    private String input;

    public RecursiveApproach(String input) {
        this.input = input;
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
