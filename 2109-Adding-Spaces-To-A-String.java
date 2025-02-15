class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for (int i = 0; i < spaces.length; i++) {
            sb.append(s.substring(c, spaces[i]) + " ");
            c = spaces[i];
        }
        sb.append(s.substring(c, s.length()));
        return sb.toString();
    }
}