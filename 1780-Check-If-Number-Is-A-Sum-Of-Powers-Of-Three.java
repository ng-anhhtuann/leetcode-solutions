class Solution {
    // public boolean checkPowersOfThree(int n) {
    // if ( n == 1 ) return true;
    // int start = 1;
    // Stack<Integer> st = new Stack<>();
    // st.push(start);
    // while (start <= n) {
    // start *= 3;
    // st.push(start);
    // }
    // while (!st.isEmpty() && n > 0) {
    // n = n - st.peek() >= 0 ? n - st.peek() : n;
    // if (n == 0)
    // return true;
    // st.pop();
    // }
    // return false;
    // }

    public boolean checkPowersOfThree(int n) {
        if (n == 1)
            return true;
        if (n % 3 == 0)
            return checkPowersOfThree(n / 3);
        if ((n - 1) % 3 == 0)
            return checkPowersOfThree((n - 1) / 3);

        return false;
    }
}