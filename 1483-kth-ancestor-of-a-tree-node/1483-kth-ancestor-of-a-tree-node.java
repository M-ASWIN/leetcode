class TreeAncestor {
    private int[][] dp;
    private int maxLevel;

    public TreeAncestor(int n, int[] parent) {
        this.maxLevel = 17; // You can adjust this value based on constraints
        this.dp = new int[n][maxLevel];

        for (int i = 0; i < n; ++i)
            Arrays.fill(dp[i], -1);

        for (int i = 0; i < n; ++i)
            dp[i][0] = parent[i];

        for (int j = 1; j < maxLevel; ++j)
            for (int i = 0; i < n; ++i)
                if (dp[i][j - 1] != -1)
                    dp[i][j] = dp[dp[i][j - 1]][j - 1];
    }

    public int getKthAncestor(int node, int k) {
        for (int j = 0; j < maxLevel; ++j) {
            if ((k & (1 << j)) > 0) {
                node = dp[node][j];
                if (node == -1) return -1;
            }
        }
        return node;
    }
}
