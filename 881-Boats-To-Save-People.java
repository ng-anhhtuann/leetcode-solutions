class Solution {
    public int numRescueBoats(int[] a, int limit) {
        int res = 0;
        Arrays.sort(a);
        int l = 0;
        int r = a.length - 1;
        while(l <= r){
            int sum = a[l] + a[r];
            if(sum <= limit){
                res++;
                l++;
                r--;
            } else {
                res++;
                r--;
            }
        }
        return res;
    }
}