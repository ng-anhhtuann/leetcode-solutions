class Solution {
    public String clearDigits(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while (count < sb.length()) {
            if (Character.isDigit(sb.charAt(count))) {
                sb.deleteCharAt(count);
                if (count > 0) {
                    sb.deleteCharAt(count - 1);
                    count--;
                }

            } else {
                count++;
            }
        }
        return sb.toString();
    }
}