class Solution {
    public boolean isAcronym(List<String> w, String s) {
        int len = s.length();
        int sz = w.size();
        if ( len != sz ) return false;
        for ( int i = 0 ; i < len ; i++ ){
            if (w.get(i).charAt(0) != s.charAt(i) ){
                return false;
            }
        }
        return true;
    }
}