class Solution {
    public boolean canMakeSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (b.length() > a.length())
            return false;
        char[] aSet = a.toCharArray();
        char[] bSet = b.toCharArray();

        int i = 0, j = 0;
        int count = 0;
        while (i < n && j < m) {
            char l = bSet[i];
            while (j < m && (aSet[j] != l && getNextCharCycle(aSet[j]) != l))
                j++;
            if (j == m)
                return false;
            if (aSet[j] == l || getNextCharCycle(aSet[j]) == l)
                count++;
            i++;
            j++;
        }
        return count == n;
    }

    public static char getNextCharCycle(char c) {
        if (c == 'z')
            return 'a';
        else
            return (char) (c + 1);
    }
}