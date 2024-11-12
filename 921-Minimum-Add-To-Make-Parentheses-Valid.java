class Solution {
    // public int minAddToMakeValid(String s) {
    // Stack<Character> stack = new Stack<>();

    // char[] cs = s.toCharArray();
    // int count = 0;
    // for (char c : cs) {
    // if (c == '(')
    // stack.push(c);
    // else if (stack.isEmpty() || stack.pop() == ')')
    // count++;
    // }
    // return count + stack.size();
    // }

    public int minAddToMakeValid(String s) {
        char[] cs = s.toCharArray();
        int open = 0;
        int close = 0;
        for (char c : cs) {
            if (c == '(')
                open++;
            else {
                if (open > 0)
                    open--;
                else
                    close++;
            }
        }
        return open + close;
    }
}