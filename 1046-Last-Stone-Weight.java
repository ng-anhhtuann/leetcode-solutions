class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int a : arr)
            q.offer(a);
        while (q.size() > 1)
            q.offer(q.poll() - q.poll());
        return q.poll();
    }
}