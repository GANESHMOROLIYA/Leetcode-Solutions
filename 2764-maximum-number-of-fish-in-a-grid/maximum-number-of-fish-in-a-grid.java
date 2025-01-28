class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxFish = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    maxFish = Math.max(maxFish, dfs(grid, visited, i, j));
                }
            }
        }
        return maxFish;
    }

    private int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || visited[r][c]) {
            return 0;
        }
        visited[r][c] = true;
        int fish = grid[r][c];
        fish += dfs(grid, visited, r - 1, c); // Up
        fish += dfs(grid, visited, r + 1, c); // Down
        fish += dfs(grid, visited, r, c - 1); // Left
        fish += dfs(grid, visited, r, c + 1); // Right

        return fish;
    }
}
