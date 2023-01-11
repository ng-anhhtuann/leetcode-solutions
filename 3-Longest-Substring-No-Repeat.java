class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // Edge case: empty or single character string
        if (s == null || s.length() <= 1)
            return s.length();
        // Set up DP array and variables
        int maxLength = 0;
        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);
        int start = 0;
        // Iterate through the string, updating the DP array and max length
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                maxLength = Math.max(maxLength, i - start);
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = i;
        }
        // Return the maximum length, accounting for the final substring
        return Math.max(maxLength, s.length() - start);
    }
}