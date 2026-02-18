public class StringReverse {
    public String uc3(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++)
            r = s.charAt(i) + r;

        return r;
    }
}
