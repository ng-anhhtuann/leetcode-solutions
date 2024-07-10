class Solution {
    class UF {
        int[] root;
        int[] rank;
        int count;

        public UF(int n) {
            root = new int[n];
            rank = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x) {
            if (root[x] != x) {
                root[x] = find(root[x]);
            }
            return root[x];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                    rank[rootX]++;
                }
                count--;
                return true;
            }
            return false;
        }

        public int getCount() {
            return count;
        }
    }

    public int maxNumEdgesToRemove(int n, int[][] a) {
        UF aliceUF = new UF(n);
        UF bobUF = new UF(n);
        int plus = 0;
        Arrays.sort(a, (c, b) -> b[0] - c[0]);
        for (int[] edge : a) {
            int type = edge[0];
            int u = edge[1] - 1;
            int v = edge[2] - 1;

            if (type == 3) {
                boolean Aconnect = aliceUF.union(u, v);
                boolean Bconnect = bobUF.union(u, v);
                if (Aconnect || Bconnect) {
                    plus++;
                }
            } else if (type == 1) {
                if (aliceUF.union(u, v)) {
                    plus++;
                }
            } else if (type == 2) {
                if (bobUF.union(u, v)) {
                    plus++;
                }
            }
        }
        if (aliceUF.getCount() > 1 || bobUF.getCount() > 1) {
            return -1;
        }
        return a.length - plus;
    }
}