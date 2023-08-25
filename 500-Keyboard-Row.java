class Solution {
    public String[] findWords(String[] w) {
        String a = "^[qwertyuiopQWERTYUIOP]+$";
        String b = "^[asdfghjklASDFGHJKL]+$";
        String c = "^[zxcvbnmZXCVBNM]+$";
        int n = w.length;
        List<String> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++){
            String tmp = w[i];
            if (tmp.matches(a) || tmp.matches(b) || tmp.matches(c)){
                list.add(tmp);
            }
        }
        return list.toArray(new String[0]);
    }
}