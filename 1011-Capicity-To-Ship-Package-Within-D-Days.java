class Solution {
    public int shipWithinDays(int[] a, int d) {
        int min = 0, max = 0;
        for (int i : a) {
            min = Math.max(min, i); //0
            max += i; //55
        }
        while (min < max) {
            int mid = (min + max) / 2; //27
            int curr = 0, currentd = 1;
            for (int i : a) {
                if (curr + i > mid) { // 27>27
                    curr = 0;
                    currentd++; //2
                }
                curr += i; // 27
            }
            if (currentd <= d) {
                max = mid;
            } else {
                min = mid + 1; // 28
            }
        }
        return min;
    }
}
