public class RotateImage {
    public void rotate(int[][] matrix) {
        // 0ms 40MB 
        // 找规律，逐位变换
        int tem = 0;
        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < (n-1) - i; j++) {
                tem = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 -i];
                matrix[j][n - 1 -i] = tem;
            }
        }
    }
    
}