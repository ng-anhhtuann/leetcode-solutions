class Solution {
    public int finalValueAfterOperations(String[] a) {
        int c = 0;
        for (String str : a) {
            if (str.equals("X++") || str.equals("++X")) {
                c++;
            } else {
                c--;
            }
        }
        return c;
    }
}