class Solution {
    public int[] findEvenNumbers(int[] a) {

        int[] f = new int[10];
        for (int i : a)
            f[i]++;

        List<Integer> d = new ArrayList<>();

        for (int i = 100; i <= 998; i = i + 2) {

            int aa = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;

            int[] tmp = new int[10];

            tmp[aa]++;
            tmp[b]++;
            tmp[c]++;

            if (tmp[aa] <= f[aa] && tmp[b] <= f[b] && tmp[c] <= f[c])
                d.add(i);

        }

        return d.stream().mapToInt(i -> i).sorted().toArray();
    }
}