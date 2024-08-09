class Solution {

    public String[] sortPeople(String[] a, int[] h) {
        int n = a.length;

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(h[i], a[i]);
        }

        Arrays.sort(h);

        String[] res = new String[n];

        for (int i = n - 1; i >= 0; i--)
            res[n - i - 1] = map.get(h[i]);

        return res;
    }
}