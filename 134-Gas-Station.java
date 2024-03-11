class Solution {
    public int canCompleteCircuit(int[] a, int[] c) {
        int n = a.length;
        if (n == 1 && a[0] >= c[0]) return 0;
        int i = 0;
        while ( i < n ){
            int sum = a[i];
            int j = i == n - 1 ? 0 : i + 1, k = i;
            int block = 0;
            boolean pass = true;
            if ( sum == 0 || sum - c[k] <= 0){
                i++;
                continue;
            } else {
                while ( j < n ) {
                    if (sum - c[k] < 0 ){
                        pass = false;
                        break;
                    } else {
                        if ( block == n-1){
                            sum = sum - c[k];
                            break;
                        } else {
                            sum = sum - c[k] + a[j];
                            j++; k++; block++;
                            if (j == n) j = 0;
                            if (k == n) k = 0;
                        }
                    }
                }
            }
            if (sum >= 0 && block == n-1 && pass) return i;
            i++;
        }
        return -1;
    }
}