class Solution {

    public int findTheLongestSubstring(String s) {
        int xor = 0;
        int[] map = new int[26];
        map['a' - 'a'] = 1;
        map['e' - 'a'] = 2;
        map['i' - 'a'] = 4;
        map['o' - 'a'] = 8;
        map['u' - 'a'] = 16;
        int[] mp = new int[32];
        for (int i = 0; i < 32; i++)
            mp[i] = -1;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            xor ^= map[s.charAt(i) - 'a'];
            if (mp[xor] == -1 && xor != 0)
                mp[xor] = i;
            len = Math.max(len, i - mp[xor]);
        }
        return len;
    }
}