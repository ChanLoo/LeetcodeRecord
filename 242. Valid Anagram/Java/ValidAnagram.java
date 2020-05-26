import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // 3ms 39.8MB
        // Sorting
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }

    // TODO Hashtable
}