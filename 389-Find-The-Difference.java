class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char i : s.toCharArray()) c ^= i;
        for(char i : t.toCharArray()) c ^= i;
        return c;
    }
}