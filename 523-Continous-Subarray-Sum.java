class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int n = a.length;
        if ( n == 1 ) return false;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for ( int i = 0; i < n; i++){
            sum += a[i];
            int tmp = sum % k;
            if (map.containsKey(tmp)) {
                if (i - map.get(tmp) > 1 ) return true;
            } else {
                map.put(tmp, i);
            }
        }
        return false;
    }
}