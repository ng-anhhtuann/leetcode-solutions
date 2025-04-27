class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] a = new int[26];
        int[] b = new int[26];
        Arrays.fill(a, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (a[idx] == -1)
                a[idx] = i;

            b[idx] = i;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] == -1)
                continue;

            Set<Character> set = new HashSet();
            for (int j = a[i] + 1; j < b[i]; j++)
                set.add(s.charAt(j));

            ans += set.size();
        }

        return ans;
    }
}