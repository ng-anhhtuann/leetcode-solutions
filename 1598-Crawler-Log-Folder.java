class Solution {
    String back = "../";
    String remain = "./";
    public int minOperations(String[] a) {
        int n = a.length;
        int count = 0;
        for ( String str : a ) {
            if (str.equals(back)) count = count - 1 <= 0 ? 0 : count - 1;
            if (!str.equals(remain) && !str.equals(back)) count++;
        }
        return count >= 0 ? count : 0;
    }
}