public class Solution {

    public int possibleStringCount(String w) {
        int n = w.length(), d = 1;
        for (int i = 1; i < n; i++)
            if (w.charAt(i - 1) == w.charAt(i)) 
                d++;
        return d;
    }
}{

}
