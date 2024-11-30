class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        sb.append(prev);
        int count = 1;
        char[] cs = s.toCharArray();
        int n = cs.length;
        for (int i = 1; i < n; i++) {
            if (cs[i] == prev)
                count++;
            else
                count = 1;
            if (count == 3) {
                count--;
            } else {
                sb.append(cs[i]);
            }
            prev = cs[i];
        }
        return sb.toString();
    }
}