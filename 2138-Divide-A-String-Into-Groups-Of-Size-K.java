class Solution {
    public String[] divideString(String s, int k, char fill) {
        char[] c = s.toCharArray();
        int n = c.length;

        int sz = n / k;
        sz += n % k != 0 ? 1 : 0;
        String[] res = new String[sz];

        StringBuilder ss = new StringBuilder(s);
        if (n % k != 0)
            for (int i = 0; i < k - n % k; i++)
                ss.append(fill);
        c = ss.toString().toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 0;

        int idx = 0;
        for (int i = 0; i < sz * k; i++) {
            sb.append(c[i]);
            count++;
            if (count == k) {
                res[idx++] = sb.toString();
                count = 0;
                sb = new StringBuilder();
            }
        }

        return res;
    }
}