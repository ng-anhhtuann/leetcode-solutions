public public class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> f = new HashMap<>();
        int mx = 0;
        int sum = 0;

        for (int i : nums) {
            f.put(i, f.getOrDefault(i, 0) + 1);
            int freq = f.get(i);

            if (freq > mx) {
                mx = freq;
                sum = freq;
            } else if (freq == mx) {
                sum += freq;
            }
        }
        return sum;
    }
}{

}
