public class NumberofIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1'){
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int x, int y) {
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++) {
            int p = x + dx[i], q = y + dy[i];
            if (p >= 0 && p < grid.length && q >=0 && q < grid[0].length && grid[p][q] == '1') {
                dfs(grid, p, q);
            }
        }
    }
}