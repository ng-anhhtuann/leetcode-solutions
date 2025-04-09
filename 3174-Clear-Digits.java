class Solution {
    public String clearDigits(String s) {

        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();

        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();

        int count = 0;
        for (char i : c) {
            q.add(i);
            count += Character.isDigit(i) ? 1 : 0;
        }
        if (count == 0)
            return s;
        while (count > 0) {
            while (q.peek() != null && !Character.isDigit(q.peek()))
                st.push(q.poll());

            while (q.peek() != null && Character.isDigit(q.peek())) {
                q.remove();
                count--;
                if (!st.empty())
                    st.pop();
            }
        }
        while (!q.isEmpty())
            sb.append(q.poll());
        while (!st.empty())
            sb.insert(0, st.pop());

        return sb.toString();
    }
}