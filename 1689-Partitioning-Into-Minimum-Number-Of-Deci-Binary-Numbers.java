class Solution {
    // public int minPartitions(String n) {
    //     int sz = n.length();
    //     int max = 0;
    //     char[] a = n.toCharArray();
    //     for (char i : a) {
    //         if (i - '0' > max)
    //             max = i - '0';
    //         if (max == 9)
    //             return max;
    //     }
    //     return max;
    // }

    public int minPartitions(String n) {
        for (int i = 9; i >= 0; i--) {
            if (n.contains(String.valueOf(i)))
                return i;
        }
        return 0;
    }
}