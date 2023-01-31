class Solution {
    // O(n/2)
    public int[] searchRange(int[] a, int target) {
        int n = a.length;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (n == 0) {
            return res;
        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (a[l] == target) {
                res[0] = l;
            } else {
                l++;
            }
            if (a[r] == target) {
                res[1] = r;
            } else {
                r--;
            }
        }
        return res;
    }

    // O(log(n))
    public int[] searchRange(int[] a, int target) {
        int[] res = new int[] { -1, -1 };
        if (a.length == 0) {
            return res;
        }
        int l = 0;
        int r = a.length - 1;
        int mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (a[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (a[l] != target) {
            return res;
        }
        res[0] = l;
        r = a.length - 1;
        while (l < r) {
            mid = l + (r - l + 1) / 2;
            if (a[mid] > target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        res[1] = r;
        return res;
    }

}