class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                a[1] = i;
                a[0] = map.get(target - numbers[i]);
                return a;
            }
            map.put(numbers[i], i);
        }
        return a;
    }

    /**
     * New solution
     * @param a
     * @param target
     * @return
     */
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[j] + a[j - i] == target) {
                    return new int[] { j, j - i };
                }
            }
        }
        return null;
    }
}