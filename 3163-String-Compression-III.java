class Solution {
    public String compressedString(String w) {
        StringBuilder sb = new StringBuilder();
        int n = w.length();

        char[] c = w.toCharArray();
        int count = 1;
        char prev = c[0];
        for (int i = 1; i < n; i++) {
            if (c[i] == prev)
                count++;
            else {
                if (count != 0) {
                    sb.append(count);
                    sb.append(prev);
                }
                prev = c[i];
                count = 1;
            }
            if (count == 9) {
                sb.append(count);
                sb.append(prev);
                prev = c[i];
                count = 0;
            }
        }
        if (count != 0) {
            sb.append(count);
            sb.append(prev);
        }
        return sb.toString();
    }
}