class Solution {
    // run 2ms beat 55%
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        int[] res = new int[2];
        for (int i = 0; i < n - 1; i++) {
            if (i >= 1 && a[i] == a[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }

    // run 1ms beat 99%
    public int[] twoSum(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
}