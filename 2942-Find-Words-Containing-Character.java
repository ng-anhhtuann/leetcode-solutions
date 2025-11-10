class Solution {
    public List<Integer> findWordsContaining(String[] a, char x) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            if (a[i].indexOf(x) != -1)
                r.add(i);
        return r;

    }
}