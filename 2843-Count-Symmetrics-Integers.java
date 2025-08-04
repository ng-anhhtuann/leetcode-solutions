class Solution {
    public int countSymmetricIntegers(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            int sz = s.length();
            int sum = 0;
            for (int j = 0; j < sz / 2; j++)
                sum += s.charAt(j) - s.charAt(sz - j - 1);
            count = sz % 2 != 1 && sum == 0 ? count + 1 : count;
        }
        return count;
    }

}