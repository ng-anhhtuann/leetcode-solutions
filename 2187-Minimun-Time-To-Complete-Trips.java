class Solution {
    public long minimumTime(int[] time, int t) {
        long l = Long.MAX_VALUE;
        long h = 0;
        long min = Long.MAX_VALUE;
        for(int it : time){
            l = Math.min(l,it);
            min = Math.min(min,it);
        }
        h = t*min;
        while( l < h){
            long mid = l +( h - l)/2;
            if( blackbox(mid, t,time)){
                h = mid;
            }
            else
                l = mid+1;
        }
        return l;
    }
    public boolean blackbox(long isvalidtime,int t,int[] time){
        long trips = 0;
        for(int it : time){
            trips += isvalidtime/it;
        }
        if(trips >= t)
            return true;
        return false;
    }
}