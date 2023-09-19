class Solution {
    public int findDuplicate(int[] a) {
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0 ; i < n; i++){
            if ( map.containsKey(a[i])){
                return a[i];
            } else {
                map.put(a[i], 1);
            }
        }
        return 0;
    }
}