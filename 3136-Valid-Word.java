class Solution {

    public boolean isValid(String w) {
        if (w.length() < 3) {
            return false;
        }
        boolean A = false;
        boolean B = false;
        for (char c : w.toCharArray()) {
            if (Character.isLetter(c)) {
                char ch = Character.toLowerCase(c);
                if (ch == 'a' ||
                        ch == 'e' ||
                        ch == 'i' ||
                        ch == 'o' ||
                        ch == 'u')
                    A = true;
                else
                    B = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return A && B;
    }
}