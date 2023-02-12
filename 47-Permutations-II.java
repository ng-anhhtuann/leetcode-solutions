class Solution {

    public List<List<Integer>> permuteUnique(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        backtrack(res, new ArrayList<>(), a, new boolean[a.length]);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> tmp, int[] a, boolean[] m) {
        if (tmp.size() == a.length) {
            res.add(new ArrayList<>(tmp));
        } else {
            for (int i = 0; i < a.length; i++) {
                if (m[i] || i > 0 && a[i] == a[i - 1] && !m[i - 1])
                    continue;
                m[i] = true;
                tmp.add(a[i]);
                backtrack(res, tmp, a, m);
                // xoa tt truoc
                m[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
