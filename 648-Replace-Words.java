class Solution {
    public String replaceWords(List<String> dict, String s) {
        String[] str = s.split("\\s+");
        int n = str.length;
        for (int i = 0; i < n; i++) {
            for (String d : dict) {
                if (str[i].startsWith(d)) {
                    str[i] = d;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                sb.append(str[i]);
            } else {
                sb.append(str[i]).append(" ");
            }
        }
        return sb.toString();
    }
}