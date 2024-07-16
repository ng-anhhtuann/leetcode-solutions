class Solution {
    public int passThePillow(int n, int time) {
        if ( n == 2 ) return time % n + 1;
        if (time < n) {
            return time + 1;
        } else if (time == n) {
            return time - 1;
        } else {
            time = time - n + 1;
            int count = n * 2 - 2;
            int rem = time % count;
            if (rem < n - 1) {
                return n - rem;
            } else {
                return rem - n + 2;
            }
        }
    }
}