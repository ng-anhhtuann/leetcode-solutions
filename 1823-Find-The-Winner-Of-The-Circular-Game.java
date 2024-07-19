class Solution {

    public int findTheWinner(int n, int k) {
        List<Integer> a = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) a.add(i);
        int idx = 0;
        while (a.size() > 1) {
            int curr = (idx + k - 1) % a.size();
            a.remove(curr);
            idx = curr;
        }
        return a.getFirst();
    }
}