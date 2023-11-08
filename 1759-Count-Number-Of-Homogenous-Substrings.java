class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        if (n == 1)
            return 1;

        long count = 0;
        char current = s.charAt(0);
        long part = 1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == current) {
                part++;
            } else {
                current = s.charAt(i);
                count += (part * (part + 1) / 2) % 1000000007;
                part = 1;
            }
        }

        count += (part * (part + 1) / 2) % 1000000007;
        return (int) count;
    }
}