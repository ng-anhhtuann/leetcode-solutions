class Solution {
    public String largestNumber(int[] a) {
        int n = a.length;
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(a[i]);
        }
// compare string presenting number
        Arrays.sort(s, (x, y) -> (y + x).compareTo(x + y));

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(Integer.parseInt(str));
        }

        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}