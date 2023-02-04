class Solution {
    // public int jump(int[] a) {
    // int n = a.length;
    // int pos = 0;
    // int count = 0;
    // if ( n == 1 ) return 0;
    // if ( n == 2 ) return 1;
    // while ( pos != n-1 ){
    // if ( pos == n-1 ) break;
    // int val = a[pos];
    // if (pos + val < n-1){
    // int max = pos+1;
    // for (int i = pos + 1; i <= pos + val; i++){
    // max = a[i] >= a[max] ? i : max;
    // }
    // pos = max;
    // count++;
    // } else {
    // count++;
    // break;
    // }
    // }
    // return count;
    // }

    public int jump(int[] a) {
        int n = a.length;
        int max = 0;
        int count = 0;
        int step = 0;
        for (int i = 0; i < n - 1; i++) {
            // System.out.println("i = " + i);
            // System.out.println("max first = "+max);
            // System.out.println("step = "+step);
            max = Math.max(max, i + a[i]);
            // System.out.println("max second = "+max);
            if (i == step) {
                count++;
                step = max;
            }
            // System.out.println("count = "+count);
            // System.out.println("===========================");
        }
        return count;
    }
}