class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            int curr = c - 'a' + 1;
            sum += curr / 10 + curr % 10;
        }
        k--;
        while (k-- > 0) {
            s = String.valueOf(sum);
            sum = 0;
            for (char c : s.toCharArray())
                sum += (int) c - 48;
            if (sum < 10 || k == 0)
                return sum;
        }
        return sum;
    }
}