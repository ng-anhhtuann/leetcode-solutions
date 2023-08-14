class Solution {
    public List<Integer> getRow(int a) {
        List<List<Integer>> res = new ArrayList<>();
        for ( int i = 1 ; i <= a+1; i++){
            List<Integer> l = new ArrayList<>();
            for ( int j = 0 ; j < i; j++){
                if (l.size() == 0 ) {
                    l.add(1);
                } else {
                    int head = (j-1 < 0) ? 0 : res.get(i-2).get(j-1);
                    int tail = res.get(i-2).size() == j ? 0 : res.get(i-2).get(j);
                    l.add(head+tail);
                }
            }
            res.add(l);
        }
        return res.get(a);
    }
}