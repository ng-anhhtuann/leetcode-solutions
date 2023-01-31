class Solution {
    /**
     * Slow approach
     */
    public String reversePrefix(String w, char a) {
        if (!w.contains(String.valueOf(a)))
            return w;
        int idx = w.indexOf(String.valueOf(a));
        String substr = w.substring(0, idx + 1);
        String tail = w.substring(idx + 1, w.length());
        int len = substr.length();
        char[] head = substr.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            char tmp = head[i];
            head[i] = head[len - 1 - i];
            head[len - 1 - i] = tmp;
        }
        String newHead = new String(head);
        return newHead + "" + tail;
    }

    /**
     * Better approach using StringBuilder
     */
    public String reversePrefix(String w, char a) {
        if (!w.contains(String.valueOf(a)))
            return w;
        int idx = w.indexOf(a);
        int len = idx + 1;
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i >= 0; i--) {
            sb.append(w.charAt(i));
        }
        return sb.append(w, len, w.length()).toString();
    }

}