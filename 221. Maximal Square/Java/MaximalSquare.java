public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int res = 0;
        int[][] f = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    f[i][j] = Math.min(f[i - 1][j - 1], Math.min(f[i][j - 1], f[i - 1][j])) + 1;
                    if (f[i][j] > res) res = f[i][j];
                }
            }
        }
        return res * res;
    }
}