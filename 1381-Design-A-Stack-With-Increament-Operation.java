class CustomStack {

    private int[] a;
    private int top;

    public CustomStack(int maxSize) {
        a = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (top < a.length - 1) {
            a[++top] = x;
        }
    }

    public int pop() {
        if (top >= 0) {
            return a[top--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);
        for (int i = 0; i < limit; i++) {
            a[i] += val;
        }
    }
}