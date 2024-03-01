class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int max = 0;
        int n = a.length;
        int i = 0;
        int cons = 0;
        while ( i < n ) {
            if ( a[i] == 1 ) {
                cons++;
                if ( i + 1 == n ) {
                    return max  > cons ? max : cons;
                }
            } else {
                max = max > cons ? max : cons;
                cons = 0;
            }
            i++;
        }
        return max;
    }
}