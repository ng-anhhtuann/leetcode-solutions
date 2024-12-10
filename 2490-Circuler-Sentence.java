class Solution {
    public boolean isCircularSentence(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        String[] listStr = str.split(" ");
        int n = listStr.length;
        for (int i = 1; i < n; i++)
            if (listStr[i].charAt(0) != listStr[i - 1].charAt(listStr[i - 1].length() - 1))
                return false;
        return true;
    }
}