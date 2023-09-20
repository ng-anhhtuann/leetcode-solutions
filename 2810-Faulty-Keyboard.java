class Solution {
    public String finalString(String s) {
        int len = s.length();
        String res = s;
        int tmp = 0;
        int i = 0;
        while (i < s.length()){
            if (s.charAt(i) != 'i'){
                i++;
            } else {
                StringBuilder sb = new StringBuilder(s.substring(0,i));
                sb = sb.reverse();
                s = sb.append(s.substring(i+1)).toString();
                i--;
            }
        }
        return s;
    }
}