class Solution {
    public List<Integer> luckyNumbers(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int minR = a[i][0];
            for (int j = 0; j < n; j++)
                minR = minR < a[i][j] ? minR : a[i][j];
            map.put(minR, 1);
        }
        for (int i = 0; i < n; i++) {
            int maxR = a[0][i];
            for (int j = 0; j < m; j++)
                maxR = maxR > a[j][i] ? maxR : a[j][i];
            if (map.get(maxR) != null)
                res.add(maxR);
        }
        return res;
    }
}