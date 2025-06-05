public class Solution {

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rootX < rootY) {
                    parent[rootY] = rootX;
                } else {
                    parent[rootX] = rootY;
                }
            }
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind(26);

        for (int i = 0; i < s1.length(); i++) {
            uf.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder result = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            result.append((char) (uf.find(c - 'a') + 'a'));
        }

        return result.toString();
    }

    
}
