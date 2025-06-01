class Solution {

    public List<String> removeAnagrams(String[] a) {
        List<String> l = new ArrayList<>();
        l.add(a[0]);
        int n = a.length;
        for (int i = 1; i < n; i++)
            if (!compare(a[i], a[i - 1]))
                l.add(a[i]);
        return l;
    }

    private boolean compare(String a, String b) {
        int[] f = new int[26];
        for (char c : a.toCharArray())
            f[c - 'a']++;
        for (char c : b.toCharArray())
            f[c - 'a']--;
        for (int x : f)
            if (x != 0)
                return false;
        return true;
    }
}