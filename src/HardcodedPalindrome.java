public class HardcodedPalindrome {
    public boolean uc2(String test){
        int fast = 0;
        int slow = test.length()-1;

        while(slow >= fast){
            if(test.charAt(slow) != test.charAt(fast)) return false;
            fast++;
            slow--;
        }

        return true;
    }
}
