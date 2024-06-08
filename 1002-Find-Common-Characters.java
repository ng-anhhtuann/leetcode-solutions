class Solution {
    public List<String> commonChars(String[] w) {
        List<String> lst = new ArrayList<>();
        int n = w.length;
        int[][] a = new int[n][26];
        for ( int i = 0; i < n; i++) {
            char[] ch = w[i].toCharArray();
            for ( char c : ch ) a[i][c - 'a']++;
        }

        for (int j = 0; j < 26; j++){
            int f = 0;
            int cnt = a[0][j];
            for (int i = 0 ; i < n; i++){
                if (a[i][j] != 0) {
                    f++;
                    cnt = Math.min(cnt, a[i][j]);
                }
            }
            if ( f == n ){
                for ( int k = 0; k < cnt; k++)
                    lst.add(Character.toString('a' + j));
            }
        }
        return lst;
    }
}