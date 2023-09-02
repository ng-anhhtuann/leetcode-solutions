class Solution {
    public int minScore(int n, int[][] a) {
        int res = Integer.MAX_VALUE;
        List<List<Pair<Integer, Integer>>> g = new ArrayList<>();
        for(int i = 0; i < n+1; i++) {
            g.add(new ArrayList<Pair<Integer, Integer>>());
        }

        for(int[] i : a) {
            g.get(i[0]).add(new Pair<>(i[1], i[2])); // u-> {v, dis}
            g.get(i[1]).add(new Pair<>(i[0], i[2])); // v-> {u, dis}
        }

        int[] vis = new int[n+1];
        Arrays.fill(vis, 0);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vis[1] = 1;
        while(!q.isEmpty()) {
            int node = q.poll();
            for(Pair<Integer, Integer> pair : g.get(node)) {
                int v = pair.getKey();
                int dis = pair.getValue();
                res = Math.min(res, dis);
                if(vis[v]==0) {
                    vis[v] = 1;
                    q.add(v);
                }
            }
        }

        return res;
    }
}