class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenA = s.length();
        int lenB = t.length();
        if ( lenA > lenB ) return false;
        if ( lenA == 0 ) return true;
        if ( lenA == lenB ) return s.equals(t);
        int i = 0, j = 0;
        while ( j < lenB ){
            if ( i < lenA && s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i > lenA-1;
    }
}