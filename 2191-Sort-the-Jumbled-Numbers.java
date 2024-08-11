public class Solution {

    public int[] sortJumbled(int[] m, int[] a) {
        List<int[]> pair = new ArrayList<int[]>();

        for (int i = 0; i < a.length; i++) {
            int val = 0;
            int temp = a[i];
            int place = 1;

            if (temp == 0) {
                pair.add(new int[] { m[0], i });
                continue;
            }
            while (temp != 0) {
                val = place * m[temp % 10] + val;
                place *= 10;
                temp /= 10;
            }
            pair.add(new int[] { val, i });
        }

        Collections.sort(pair, (x, y) -> x[0] - y[0]);

        int[] res = new int[a.length];
        for (int i = 0; i < pair.size(); i++) {
            res[i] = a[pair.get(i)[1]];
        }

        return res;
    }
}