class Solution {
    public int numRabbits(int[] a) {

        int n = a.length;
        int[] c = new int[1000];

        int res = 0;
        for (int x : a) {
            if (++c[x] == 1)
                res += x + 1;
            if (c[x] == x + 1)
                c[x] = 0;
        }

        return res;
    }
}