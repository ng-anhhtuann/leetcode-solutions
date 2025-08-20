class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        int count = 1;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder(String.valueOf(prev));

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == prev)
                count++;
            else {
                count = 1;
                prev = s.charAt(i);
            }
            if (count < 3)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}