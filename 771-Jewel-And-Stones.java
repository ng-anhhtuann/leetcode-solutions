class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        int resCount = 0;
        for ( int i = 0 ; i < s.length; i++){
            for ( int k = 0 ; k < j.length; k++){
                if ( s[i] == j[k]) resCount++;
            }
        }
        return resCount;
    }
}