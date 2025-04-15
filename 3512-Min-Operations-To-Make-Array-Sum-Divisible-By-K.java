public class Solution {
    public int minOperations(int[] a, int k) {
        int sum = 0;
        for (int i : a) sum += i;
        return sum % k;
    }
}{

}
