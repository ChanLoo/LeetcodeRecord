public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        // 4ms 38.2MB
        int n = s.length();
        StringBuffer sb = new StringBuffer();
        sb.append("$#");
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append("^");
        n = sb.length();

        int[] f = new int[n];
        int im = 0, rm = 0, res = 0;
        for (int i = 1; i < n - 1; i++) {
            int j = 2 * im - i;
            f[i] = i <= rm ? Math.min(f[j], rm - i + 1) : 1;
            while (sb.charAt(i + f[i]) == sb.charAt(i - f[i])) f[i]++;
            if (i + f[i] - 1 > rm) {
                im = i;
                rm = i + f[i] - 1;
            }
            res += f[i] / 2;
        }
        return res;

    }
    
    // public int countSubstrings(String s) {
    //     // 5ms 37.4MB
    //     int n = s.length(), res = 0;
    //     for (int i = 0; i < 2 * n - 1; i++) {
    //         int l = i / 2, r = i / 2 + i % 2;
    //         while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
    //             l--;
    //             r++;
    //             res++;
    //         }
    //     }
    //     return res;

    // }
}