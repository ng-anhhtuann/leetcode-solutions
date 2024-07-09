class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] a) {
        List<Integer>[] adjLst = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjLst[i] = new ArrayList<>();
        }

        int[] d = new int[n];
        for (int[] edge : a) {
            int from = edge[0];
            int to = edge[1];
            adjLst[from].add(to);
            d[to]++;
        }
        Queue<Integer> node0 = new LinkedList<>();
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 0) {
                node0.add(i);
            }
        }
        List<Integer> nodeOrder = new ArrayList<>();
        while (!node0.isEmpty()) {
            int node = node0.poll();
            nodeOrder.add(node);

            for (int neighbor : adjLst[node]) {
                d[neighbor]--;
                if (d[neighbor] == 0) {
                    node0.add(neighbor);
                }
            }
        }

        List<List<Integer>> actLst = new ArrayList<>();
        List<Set<Integer>> actSetLst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            actLst.add(new ArrayList<>());
            actSetLst.add(new HashSet<>());
        }

        for (int node : nodeOrder) {
            for (int neighbor : adjLst[node]) {
                actSetLst.get(neighbor).add(node);
                actSetLst
                    .get(neighbor)
                    .addAll(actSetLst.get(node));
            }
        }

        for (int i = 0; i < actLst.size(); i++) {
            actLst.get(i).addAll(actSetLst.get(i));
            Collections.sort(actLst.get(i));
        }

        return actLst;
    }
}