class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] cs = s.toCharArray();
        int count = 0;
        for (char c : cs) {
            if (c == '(')
                stack.push(c);
            if (c == ')') {
                if (stack.isEmpty() || stack.pop() == ')')
                    count++;
            }
        }
        return count + stack.size();
    }
}