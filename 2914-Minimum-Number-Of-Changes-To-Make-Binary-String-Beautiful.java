class Solution {
    public int minChanges(String s) {
        char c = s.charAt(0);

        int count = 0;
        int op = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                continue;
            }
            if (count % 2 == 0)
                count = 1;
            else {
                count = 0;
                op++;
            }

            c = s.charAt(i);
        }

        return op;
    }
}