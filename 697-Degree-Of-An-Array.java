class Solution {
    // public int findShortestSubArray(int[] a) {
    //     int n = a.length;
    //     int l = 0;
    //     int r = 0;
    //     int maxDeg = 0;
    //     int minDis = 0;
    //     for ( int i = 0 ; i < n-1 ; i++ ){
    //         int piv = a[i];
    //         l = i;
    //         int cnt = 1;
    //         for ( int j = i+1; j < n ; j++ ){
    //             if (a[j] == piv) {
    //                 r = j;
    //                 cnt++;
    //             }
    //         }
    //         r = cnt == 1 ? l : r;
    //         if ( cnt == maxDeg ){
    //             if (minDis > ( r - l )) {
    //                 minDis = r - l;
    //                 maxDeg = cnt;
    //             }
    //         } else if ( cnt > maxDeg ){
    //             maxDeg = cnt;
    //             minDis = r - l;
    //         }
    //     }
    //     return minDis + 1;
    // }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> occ = new HashMap<>();
        int maxDeg = 0;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Update the freq
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            // Update the first occurrence if not present
            occ.putIfAbsent(num, i);

            // Check if the current subarray is of the same degree
            if (freq.get(num) == maxDeg) {
                minLen = Math.min(minLen, i - occ.get(num) + 1);
            } else if (freq.get(num) > maxDeg) {
                maxDeg = freq.get(num);
                minLen = i - occ.get(num) + 1;
            }
        }

        return minLen;
    }
}