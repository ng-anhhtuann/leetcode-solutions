class Solution {

    public int rangeSum(int[] a, int n, int l, int r) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                lst.add(sum);
            }
        }
        Collections.sort(lst);

        int res = 0, mod = (int) 1e9 + 7;
        for (int i = l - 1; i <= r - 1; i++) {
            res = (res + lst.get(i)) % mod;
        }
        return res;
    }
}