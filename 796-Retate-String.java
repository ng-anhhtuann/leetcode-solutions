class Solution {
    public boolean rotateString(String s, String g) {
        if (s.length() != g.length())
            return false;
        String t = s + s;
        return t.contains(g);
    }
}

// 0 1 2 3 4
// 2 3 4 0 1

// 0 1 2 4 3