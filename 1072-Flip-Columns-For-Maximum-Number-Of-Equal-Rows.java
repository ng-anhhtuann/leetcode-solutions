class Solution {

    public int maxEqualRowsAfterFlips(int[][] a) {
        Map<String, Integer> map = new HashMap<>();

        for (int[] row : a) {
            StringBuilder sb = new StringBuilder("");

            for (int col = 0; col < row.length; col++) {
                if (row[0] == row[col])
                    sb.append("T");
                else
                    sb.append("F");
            }

            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }

        int max = 0;
        for (int f : map.values())
            max = Math.max(f, max);

        return max;
    }
}