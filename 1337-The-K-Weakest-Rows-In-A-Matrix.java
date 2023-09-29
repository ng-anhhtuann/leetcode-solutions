class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int[] res = new int[k];
        int m = a.length, n = a[0].length;
        int[] cnt = new int[m];
        for ( int i = 0 ; i < m ; i++){
            int count = 0;
            for ( int j = 0; j < n ; j++ ){
                count += a[i][j];
            }
            cnt[i] = count;
        }
        return resultArray(cnt, k);
    }

    class IndexValuePair implements Comparable<IndexValuePair> {
        int index;
        int value;
        public IndexValuePair(int index, int value) {
            this.index = index;
            this.value = value;
        }
        @Override
        public int compareTo(IndexValuePair other) {
            return Integer.compare(this.value, other.value);
        }
    }
    public int[] resultArray(int[] cnt, int k) {
        int n = cnt.length;
        List<IndexValuePair> indexValuePairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indexValuePairs.add(new IndexValuePair(i, cnt[i]));
        }
        Collections.sort(indexValuePairs);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = indexValuePairs.get(i).index;
        }
        return result;
    }
}