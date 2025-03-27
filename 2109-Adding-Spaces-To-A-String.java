class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i : spaces) {
            sb.insert(i + count++, " ");
        }
        return sb.toString();
    }
}