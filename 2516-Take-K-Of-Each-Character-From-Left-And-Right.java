class Solution {
    boolean isValid(int[] f, int k) {
        return f[0] >= k && f[1] >= k && f[2] >= k;
    }

    public int takeCharacters(String s, int k) {
        int[] f = new int[3];

        for (char c : s.toCharArray())
            f[c - 'a'] += 1;

        if (!isValid(f, k))
            return -1;

        int i = 0, j = 0, max = -1;
        while (j < s.length()) {
            f[s.charAt(j) - 'a'] -= 1;
            while (!isValid(f, k)) {
                f[s.charAt(i) - 'a'] += 1;
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }

        return s.length() - max;
    }
}