class Solution {
    private final String A = "equilateral";
    private final String B = "isosceles";
    private final String C = "scalene";
    private final String D = "none";

    public String triangleType(int[] d) {
        int a = d[0], b = d[1], c = d[2];
        if (a + b <= c || a + c <= b || b + c <= a)
            return D;
        if (a == b && b == c)
            return A;
        if (a == b || b == c || a == c)
            return B;
        return C;
    }
}