class Solution {
    public int majorityElement(int[] a) {
        Arrays.sort(a);
        return a[a.length/2];
    }
}