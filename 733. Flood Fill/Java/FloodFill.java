public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // 1ms 40.8MB DFS
        if (image.length == 0 || image[0].length == 0) return image;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;
        image[sr][sc] = newColor;
        for (int i = 0; i < 4; i++) {
            int x = sr + dx[i], y = sc + dy[i];
            if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == oldColor)
                floodFill(image, x, y, newColor);
        }
        return image;
    }
}