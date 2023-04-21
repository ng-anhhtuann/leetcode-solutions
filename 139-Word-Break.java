class Solution {
    public boolean wordBreak(String s, List<String> w) {
        int len = w.size();
        for (int i = 0; i < len; i++) {
            if (s.contains(w.get(i))) {
                // System.out.println("word = " + w.get(i));
                s = s.replace(w.get(i), "");
                // System.out.println("s = " + s );
            }
        }
        return s == "";
    }

    public boolean wordBreak(String s, List<String> w) {
        Set<String> dict = new HashSet<>(w);
        boolean[] a = new boolean[s.length() + 1];
        a[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] && dict.contains(s.substring(j, i))) {
                    a[i] = true;
                    break;
                }
            }
        }

        return a[s.length()];
    }
}