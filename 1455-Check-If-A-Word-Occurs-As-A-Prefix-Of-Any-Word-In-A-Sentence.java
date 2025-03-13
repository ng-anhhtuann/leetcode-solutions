class Solution {
    public int isPrefixOfWord(String s, String key) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith(key))
                return i + 1;
        }
        return -1;
    }

}