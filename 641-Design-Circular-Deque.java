class MyCircularDeque {

    int[] a;
    int head;
    int tail;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        a = new int[k];
        size = 0;
        capacity = k;
        head = 0;
        tail = k - 1;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;
        head = (head - 1 + capacity) % capacity;
        a[head] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;
        tail = (tail + 1) % capacity;
        a[tail] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;
        head = (head + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;
        tail = (tail - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty())
            return -1;
        return a[head];
    }

    public int getRear() {
        if (isEmpty())
            return -1;
        return a[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}