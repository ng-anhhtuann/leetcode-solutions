class Solution {
    public int countOdds(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            a++;
            b--;
        } else if (a % 2 == 0 && b % 2 == 1) {
            a++;
        } else if (a % 2 == 1 && b % 2 == 0) {
            b--;
        } else {
        }
        if (a == b && a % 2 == 1)
            return 1;
        return (b - a) / 2 + 1;
    }
}