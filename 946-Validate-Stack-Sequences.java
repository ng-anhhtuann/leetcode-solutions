class Solution {
    public boolean validateStackSequences(int[] push, int[] pop) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < push.length; i++) {
            stack.push(push[i]);
            while (!stack.isEmpty() && stack.peek() == pop[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}