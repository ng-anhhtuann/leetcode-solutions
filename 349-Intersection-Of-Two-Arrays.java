class Solution {
    public int[] intersection(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        Set<Integer> set = new HashSet<>();
        if ( m < n ){
            int[] tmp = a; int sz = m;
            a = b; m = n;
            b = tmp; n = sz;
        } // m greater than n
        for (int i : b){
            set.add(i);
        }
        List<Integer> lst = new ArrayList<>(set);
        List<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < lst.size(); i++ ){
            for (int j : a){
                if (lst.get(i) == j){
                    list.add(lst.get(i));
                    break;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}