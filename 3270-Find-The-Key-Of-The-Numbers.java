class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder a = new StringBuilder().append(num1);
        StringBuilder b = new StringBuilder().append(num2);
        StringBuilder c = new StringBuilder().append(num3);

        StringBuilder sb = new StringBuilder();

        int idxA = 0, idxB = 0, idxC = 0;
        for ( int i = 0 ; i < 4; i++) {
            String tmpA = String.valueOf(a.length() < 4 - i ? '0' : a.charAt(idxA++));
            String tmpB = String.valueOf(b.length() < 4 - i ? '0' : b.charAt(idxB++));
            String tmpC = String.valueOf(c.length() < 4 - i ? '0' : c.charAt(idxC++));
            sb.append(Math.min(Integer.valueOf(tmpA), Math.min(Integer.valueOf(tmpB), Integer.valueOf(tmpC))));
        }

        return Integer.valueOf(sb.toString());
    }
}