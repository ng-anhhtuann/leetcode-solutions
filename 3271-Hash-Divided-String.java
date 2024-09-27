class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                sb.append((char) (sum % 26 + 97));
                count = 0;
                sum = 0;
            }
            sum += s.charAt(i) - 'a';
            count++;
        }
        sb.append((char) (sum % 26 + 97));
        return sb.toString();
    }
}