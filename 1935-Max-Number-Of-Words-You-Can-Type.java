class Solution {
    public int canBeTypedWords(String txt, String s) {
        int[] d = new int[26];
        for (char i : s.toCharArray())
            d[i - 'a']++;

        char[] a = txt.toCharArray();
        int n = a.length;

        int count = 1;
        for (char i : a)
            count += i == ' ' ? 1 : 0;

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == ' ') {
                flag = false;
                continue;
            }
            if (flag)
                continue;
            if (d[a[i] - 'a'] == 1) {
                count--;
                flag = true;
            }
        }

        return count;
    }
}