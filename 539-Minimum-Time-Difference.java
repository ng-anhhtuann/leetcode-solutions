class Solution {
    public int findMinDifference(List<String> a) {
        int n = a.size();
        int[] d = new int[n];
        int idx = 0;
        for (String s : a) {
            int hr = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            int mi = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
            d[idx++] = hr * 60 + mi;
        }
        int max = 24 * 60;
        int min = max;
        int curr;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                curr = Math.min(Math.abs(d[j] - d[i]), Math.abs(max - Math.max(d[j], d[i]) + Math.min(d[i], d[j])));
                min = min < curr ? min : curr;
                if (min == 0)
                    return min;
            }
        }
        return min;
    }
}

/**
 * 0 1440
 * 0 240 1320
 * 240
 *
 *
 */