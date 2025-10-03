class Solution {
    public List<Integer> findKDistantIndices(int[] a, int key, int k) {
        int n = a.length;
        List<Integer> l = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            if (a[i] == key)
                q.add(i);

        while (!q.isEmpty()) {
            int i = q.poll();
            int lt = i - k >= 0 ? i - k : 0;
            int rt = i + k < n ? i + k : n - 1;

            if (l.isEmpty()) {
                for (int j = lt; j <= rt; j++)
                    l.add(j);
            } else {
                int lst = l.get(l.size() - 1);
                if (lt > lst) {
                    for (int j = lt; j <= rt; j++)
                        l.add(j);
                } else if (rt > lst) {
                    for (int j = lst + 1; j <= rt; j++)
                        l.add(j);
                } else {
                }
            }
        }

        return l;
    }
}