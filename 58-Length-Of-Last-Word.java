class Solution {
    // 47% fast
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                if (count != 0) {
                    prev = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return count == 0 ? prev : count;
    }

    // beat 100% vs 70 memory
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count != 0) {
                return count;
            }
        }
        return count;
    }

}