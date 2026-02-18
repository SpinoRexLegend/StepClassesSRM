import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStackApproach {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
}