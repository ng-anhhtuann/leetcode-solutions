/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    //binary search
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
//tenary search
     public int firstBadVersion(int n) {
         int left = 1;
         int right = n;
         while (left < right) {
             int mid1 = left + (right - left) / 3;
             int mid2 = right - (right - left) / 3;
             if (isBadVersion(mid1)) {
                 right = mid1;
             } else if (isBadVersion(mid2)) {
                 left = mid1 + 1;
                 right = mid2;
             } else {
                 left = mid2 + 1;
             }
         }
         return left;
     }
}