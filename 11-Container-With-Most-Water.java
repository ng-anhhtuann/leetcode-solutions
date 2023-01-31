class Solution {
    public int maxArea(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int max = 0;
        while (left < right) {
            int area = (right - left) * Math.min(a[left], a[right]);
            max = Math.max(max, area);
            if (a[left] < a[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length - 1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans)
                ans = res;
        }
        return ans;
    }

}