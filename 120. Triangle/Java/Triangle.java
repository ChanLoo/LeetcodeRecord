public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[n + 10][n + 10];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                f[i][j] = Integer.MAX_VALUE;
            }
        }

        f[1][1] = triangle.get(0).get(0);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i - 1).get(j - 1);
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            res = Math.min(res, f[n][i]);
        }

        return res;
    }
}