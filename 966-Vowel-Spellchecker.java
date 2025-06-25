class Solution {
    Set<String> raw = new HashSet();
    Map<String, String> capital = new HashMap();
    Map<String, String> vowel = new HashMap();

    public String[] spellchecker(String[] a, String[] q) {

        for (String w : a) {
            raw.add(w);
            String low = w.toLowerCase();
            capital.putIfAbsent(low, w);
            String high = buildVowel(low);
            vowel.putIfAbsent(high, w);
        }
        String[] d = new String[q.length];
        int t = 0;
        for (String i : q)
            d[t++] = solve(i);
        return d;
    }

    public String solve(String q) {
        if (raw.contains(q))
            return q;
        String queryL = q.toLowerCase();
        if (capital.containsKey(queryL))
            return capital.get(queryL);
        String queryLV = buildVowel(queryL);
        if (vowel.containsKey(queryLV))
            return vowel.get(queryLV);
        return "";
    }

    public String buildVowel(String w) {
        StringBuilder d = new StringBuilder();
        for (char c : w.toCharArray())
            d.append(isVowel(c) ? '*' : c);
        return d.toString();
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}