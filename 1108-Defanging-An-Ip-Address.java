class Solution {
    public String defangIPaddr(String a) {
        StringBuilder sb = new StringBuilder();
        for ( char c : a.toCharArray()) {
            if ( c == '.') {
                sb.append("[");
                sb.append(c);
                sb.append("]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}