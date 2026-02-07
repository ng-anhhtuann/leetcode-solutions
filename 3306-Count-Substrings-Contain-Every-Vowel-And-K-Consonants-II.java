class Solution {

    public long countOfSubstrings(String w, int k) {
        long res = 0;
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int cCon = 0;

        int[] d = new int[w.length()];
        int idx = w.length();
        for (int i = w.length() - 1; i >= 0; i--) {
            d[i] = idx;
            if (!isVowel(w.charAt(i)))
                idx = i;
        }

        while (r < w.length()) {
            char cr = w.charAt(r);

            if (isVowel(cr))
                map.put(cr, map.getOrDefault(cr, 0) + 1);
            else
                cCon++;

            while (cCon > k) {
                char c = w.charAt(l);
                if (isVowel(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0)
                        map.remove(c);
                } else {
                    cCon--;
                }
                l++;
            }

            while (l < w.length() && map.keySet().size() == 5 && cCon == k) {
                res += d[r] - r;
                char c = w.charAt(l);
                if (isVowel(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0)
                        map.remove(c);
                } else {
                    cCon--;
                }
                l++;
            }
            r++;
        }

        return res;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}