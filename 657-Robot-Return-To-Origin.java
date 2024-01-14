class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        if ( n % 2 != 0) return false;
        int UDCheck = 0, LRCheck = 0;
        for ( int i = 0 ; i < n; i++){
            if (moves.charAt(i) == 'U' ) {
                UDCheck++;
            }
            if (moves.charAt(i) == 'L' ) {
                LRCheck++;
            }
            if (moves.charAt(i) == 'D' ) {
                UDCheck--;
            }
            if (moves.charAt(i) == 'R' ) {
                LRCheck--;
            }
        }
        return (UDCheck == LRCheck) && UDCheck == 0;
    }
}