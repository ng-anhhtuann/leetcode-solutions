class Solution {
    public int maximumSwap(int num) {
        String str = String.valueOf(num);
        char[] cs = str.toCharArray();
        int n = cs.length;
        for (int i = 0; i < n - 1; i++) {
            int max = cs[i] - '0';
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (cs[j] - '0' >= max) {
                    max = cs[j] - '0';
                    idx = j;
                }
            }
            if (max != cs[i] - '0') {
                char tmp = cs[i];
                cs[i] = cs[idx];
                cs[idx] = tmp;
                return Integer.valueOf(String.valueOf(cs));
            }
        }
        return num;
    }
}