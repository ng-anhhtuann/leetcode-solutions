class Solution {

    public int countDays(int d, int[][] m) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int sum = 0, res = 0, pre = d;

        for (int[] i : m) {
            // System.out.println("pre = " + pre);
            // System.out.println("i[0] = " + i[0]);
            // System.out.println("i[1] = " + (i[1]+1));
            // System.out.println("map get i[0] = " + (map.getOrDefault(i[0], 0) + 1));
            // System.out.println("map get i[1] = " + (map.getOrDefault(i[1] + 1, 0) - 1));
            pre = Math.min(pre, i[0]);
            map.put(i[0], map.getOrDefault(i[0], 0) + 1);
            map.put(i[1] + 1, map.getOrDefault(i[1] + 1, 0) - 1);
        }

        res += (pre - 1);
        for (Map.Entry<Integer, Integer> day : map.entrySet()) {
            int c = day.getKey();

            if (sum == 0)
                res += (c - pre);
            sum += day.getValue();
            pre = c;
        }

        res += d - pre + 1;
        return res;
    }
}