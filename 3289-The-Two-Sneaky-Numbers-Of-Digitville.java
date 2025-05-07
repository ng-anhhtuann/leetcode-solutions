class Solution {
    public int[] getSneakyNumbers(int[] a) {
        int[] d = new int[2];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    d[count] = a[i];
                    count++;
                    break;
                }
            }
        }
        return d;
    }
}