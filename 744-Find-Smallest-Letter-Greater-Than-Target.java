class Solution {
    public char nextGreatestLetter(char[] a, char t) {
        char f = a[0];
        Arrays.sort(a);
        for (char i : a )
            if ( i > t ) return i;
        return f;
    }
}