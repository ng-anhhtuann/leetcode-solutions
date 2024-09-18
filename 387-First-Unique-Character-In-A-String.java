class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] a = new int[26];
        for (char i : c)
            a[i - 'a']++;
        for (int i = 0; i < c.length; i++)
            if (a[c[i] - 'a'] == 1)
                return i;
        return -1;
    }

    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for ( int i = 0 ; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(String.valueOf(entry.getKey()));
            }
        }
        return -1;
    }
}