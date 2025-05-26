class Solution {
    private String colors;
    private int[][] dp;
    private int[] visited;
    private List<List<Integer>> graph;

    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        this.colors = colors;
        this.dp = new int[n][26];
        this.visited = new int[n];
        this.graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        int maxColorValue = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (hasCycleAndUpdateDP(i)) {
                    return -1;
                }
            }

            for (int c = 0; c < 26; c++) {
                maxColorValue = Math.max(maxColorValue, dp[i][c]);
            }
        }

        return maxColorValue;
    }

    private boolean hasCycleAndUpdateDP(int node) {
        if (visited[node] == 1) return true;
        if (visited[node] == 2) return false;

        visited[node] = 1;

        for (int neighbor : graph.get(node)) {
            if (hasCycleAndUpdateDP(neighbor)) {
                return true;
            }

            for (int c = 0; c < 26; c++) {
                dp[node][c] = Math.max(dp[node][c], dp[neighbor][c]);
            }
        }

        int colorIndex = colors.charAt(node) - 'a';
        dp[node][colorIndex]++;
        visited[node] = 2;

        return false;
    }
}
