class Solution {
    public String removeStars(String s) {
        int j = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); ++i)
            if (c[i] == '*') j--;
            else
                c[j++] = c[i];
        return new String(c, 0, j);
    }
}

