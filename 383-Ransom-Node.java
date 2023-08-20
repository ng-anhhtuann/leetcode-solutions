class Solution {
    public boolean canConstruct(String a, String b) {
        for( int i = 0 ; i < a.length(); i++){
            if (!b.contains(String.valueOf(a.charAt(i)))){
                return false;
            } else {
                b = b.replaceFirst(String.valueOf(a.charAt(i)), "");
            }
        }
        return true;
    }
}