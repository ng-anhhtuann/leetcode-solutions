public class Solution {

    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {
            while (i < n && start.charAt(i) == '_')
                i++;
            while (j < n && target.charAt(j) == '_')
                j++;
            if (i == n || j == n)
                return i == n && j == n;

            if (start.charAt(i) != target.charAt(j) ||
                    (start.charAt(i) == 'L' && i < j) ||
                    (start.charAt(i) == 'R' && i > j))
                return false;

            i++;
            j++;
        }

        return true;
    }
}