class Solution {

    public int[] findXSum(int[] a, int k, int x) {
        int n = a.length;
        int[] d = new int[n - k + 1];

        for (int i = 0; i <= n - k; ++i) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; ++j)
                map.put(a[j], map.getOrDefault(a[j], 0) + 1);

            List<int[]> f = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                f.add(new int[] { entry.getValue(), entry.getKey() });
            }

            f.sort((c, b) -> b[0] != c[0] ? b[0] - c[0] : b[1] - c[1]);
            int sum = 0;
            for (int j = 0; j < x && j < f.size(); ++j)
                sum += f.get(j)[0] * f.get(j)[1];
            d[i] = sum;
        }

        return d;
    }
}