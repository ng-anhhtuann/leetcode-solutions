class KthLargest {

    PriorityQueue<Integer> q;
    int k;

    public KthLargest(int k, int[] a) {
        q = new PriorityQueue<>();
        this.k = k;

        for (int num : a)
            add(num);
    }

    public int add(int val) {
        if (q.size() < k || q.peek() < val) {
            q.add(val);
            if (q.size() > k)
                q.remove();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, a);
 * int param_1 = obj.add(val);
 */