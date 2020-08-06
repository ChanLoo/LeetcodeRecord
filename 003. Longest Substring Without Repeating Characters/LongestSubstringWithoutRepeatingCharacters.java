public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // 13ms 40.2MB
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        int res = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (hash.get(s.charAt(j)) == null) hash.put(s.charAt(j), 1);
            else hash.put(s.charAt(j), hash.get(s.charAt(j)) + 1); 
            while (hash.get(s.charAt(j)) > 1) {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}