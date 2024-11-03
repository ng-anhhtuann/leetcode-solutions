class Solution {

    public boolean areSentencesSimilar(String s1, String s2) {
        Deque<String> q1 = new ArrayDeque<>(Arrays.asList(s1.split(" ")));
        Deque<String> q2 = new ArrayDeque<>(Arrays.asList(s2.split(" ")));
        while (!q1.isEmpty() && !q2.isEmpty() &&
                q1.peek().equals(q2.peek())) {
            q1.poll();
            q2.poll();
        }
        while (!q1.isEmpty() && !q2.isEmpty() &&
                q1.peekLast().equals(q2.peekLast())) {
            q1.pollLast();
            q2.pollLast();
        }
        return q1.isEmpty() || q2.isEmpty();
    }
}