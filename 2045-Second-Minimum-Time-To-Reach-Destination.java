class Solution {
    public int secondMinimum(int n, int[][] e, int time, int change) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] o : e) {
            int a = o[0], b = o[1];
            map.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            map.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        int[] dst = new int[n + 1], dist2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dst[i] = dist2[i] = -1;
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 1, 1 });
        dst[1] = 0;

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int node = temp[0];
            int freq = temp[1];

            int take = freq == 1 ? dst[node] : dist2[node];
            if ((take / change) % 2 == 1) {
                take = change * (take / change + 1) + time;
            } else {
                take = take + time;
            }

            if (!map.containsKey(node))
                continue;
            for (int nb : map.get(node)) {
                if (dst[nb] == -1) {
                    dst[nb] = take;
                    q.offer(new int[] { nb, 1 });
                } else if (dist2[nb] == -1 && dst[nb] != take) {
                    if (nb == n)
                        return take;
                    dist2[nb] = take;
                    q.offer(new int[] { nb, 2 });
                }
            }

        }
        return 0;
    }
}