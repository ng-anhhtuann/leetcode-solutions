class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        if (m < n) {
            return res;
        }
        int[] a = new int[26];
        for (int i = 0; i < n; i++) {
            a[p.charAt(i) - 'a']++;
        }
        int left = 0, right = 0, count = n;
        while (right < m) {
            if (a[s.charAt(right++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                res.add(left);
            }
            if (right - left == n && a[s.charAt(left++) - 'a']++ >= 0) {
                count++;
            }
        }
        return res;
    }



    // public List<Integer> findAnagrams(String s, String p) {
    //     List<Integer> res = new ArrayList<>();
    //     int m = s.length();
    //     int n = p.length();
    //     if ( m < n ) return res;
    //     int[] a = new int[26];
    //     int[] b = new int[26];
    //     for ( int i = 0 ; i < n; i++ ){
    //         a[p.charAt(i) - 'a']++;
    //     }
    //     for ( int i = 0 ; i < m ; i++ ){
    //         b[s.charAt(i) - 'a']++;
    //         if (i >= n) {
    //             b[s.charAt(i - n) - 'a']--;
    //         } // xoa state truoc
    //         if (Arrays.equals(a, b)) {
    //             res.add(i - n + 1);
    //         } // them tu dau chuoi
    //     }
    //     return res;
    // }
}