class Solution {
    public int isPrefixOfWord(String s, String key) {
        int wordIndex = 1;
        int start = 0;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                String word = extractSubstring(s, start, i);
                if (isPrefix(word, key)) {
                    return wordIndex;
                }
                wordIndex++;
                start = i + 1;
            }
        }
        return -1;
    }

    private String extractSubstring(String s, int start, int end) {
        char[] chars = new char[end - start];
        for (int i = start; i < end; i++) {
            chars[i - start] = s.charAt(i);
        }
        return new String(chars);
    }

    private boolean isPrefix(String str, String prefix) {
        if (prefix.length() > str.length()) {
            return false;
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}