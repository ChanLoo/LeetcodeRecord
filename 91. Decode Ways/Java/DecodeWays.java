public class DecodeWays {
    public int numDecodings(String s) {
        // 1ms 37.6MB
        int n = s.length();
        int[] f = new int[n];
        if (s.charAt(0) == '0') return 0;
        else f[0] = 1;
        if (n == 1) return f[0];
        if (s.charAt(1) == '0') {
            if (s.charAt(0) == '1' || s.charAt(0) == '2') f[1] = 1;
            else f[1] = 0;
        } else {
            if (s.charAt(0) == '1') f[1] = 2;
            else if (s.charAt(0) == '2' && s.charAt(1) >= '1' && s.charAt(1) < '7') f[1] = 2;
            else f[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') f[i] = f[i - 2];
                else f[i] = 0;
            } else {
                if (s.charAt(i - 1) == '1') f[i] = f[i - 2] + f[i - 1];
                else if (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) < '7') f[i] = f[i - 2] + f[i - 1];
                else f[i] = f[i - 1];
            }
        }
        return f[n - 1];
    }
}