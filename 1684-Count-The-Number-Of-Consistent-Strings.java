class Solution {
    public int countConsistentStrings(String s, String[] w) {
        int count = 0;
        int[] a = new int[26];
        for (char c : s.toCharArray())
            a[c - 'a'] = 1;
        for (String str : w) {
            boolean check = true;
            for (char c : str.toCharArray()) {
                if (a[c - 'a'] == 0) {
                    check = false;
                    break;
                }
            }
            count += check ? 1 : 0;
        }
        return count;
    }
}