  class MyQueue {
    private Deque<Integer> inStack;
    private Deque<Integer> outStack;

    public MyQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }
    
    // Enqueue (O(1))
    public void push(int x) {
        inStack.push(x);
    }
    
    // Dequeue (Amortized O(1))
    public int pop() {
        moveIfNeeded();
        return outStack.pop();
    }
    
    // Peek front (Amortized O(1))
    public int peek() {
        moveIfNeeded();
        return outStack.peek();
    }
    
    // Check empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    // Helper: Move elements only when outStack is empty
    private void moveIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
