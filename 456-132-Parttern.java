class Solution {
    public boolean find132pattern (int[] a) {
        Stack<Integer> s = new Stack ();
        int second = Integer.MIN_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a [i] < second)
                return true;
            while (!s.isEmpty() && a [i] > s.peek ())
                second = s.pop ();
            s.push(a[i]);
        }
        return false;
    }
}