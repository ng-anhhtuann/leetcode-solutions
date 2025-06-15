class Solution {
    public int compareVersion(String a, String b) {
        String[] v1 = a.split("\\.");
        String[] v2 = b.split("\\.");

        int n = Math.max(v1.length, v2.length);
        for (int i = 0; i < n; i++) {
            int m = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int p = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (m < p)
                return -1;
            if (m > p)
                return 1;
        }
        return 0;
    }
}