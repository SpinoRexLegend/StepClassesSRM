import java.util.Stack;

public class StackBased {
    public boolean isPalindromeButWIthStack(String mriganka){
        Stack<Character> hash = new Stack<>();
        int index = 0;

        for(int i = 0; i < mriganka.length(); i++)
                hash.push(mriganka.charAt(i));

        while(!hash.isEmpty()){
            if(hash.pop() != mriganka.charAt(index++))
                return false;
        }

        return true;
    }
}
