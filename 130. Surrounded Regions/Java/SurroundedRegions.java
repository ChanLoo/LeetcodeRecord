public class SurroundedRegions {
    int m, n;
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][n - 1] == 'O') dfs(board, i, n - 1);
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[m - 1][j] == 'O') dfs(board, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'Y') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        board[x][y] = 'Y';
        for(int i = 0; i < 4; i++) {
            int p = x + dx[i], q = y + dy[i];
            if (p >= 0 && p < m && q >=0 && q < n && board[p][q] == 'O') dfs(board, p, q);
        }
    }
}