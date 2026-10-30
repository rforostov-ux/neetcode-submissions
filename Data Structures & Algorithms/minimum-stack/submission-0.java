class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minn;
    public MinStack() {
       stack = new Stack<>();
       minn = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minn.isEmpty()) {
            minn.push(val);
        }
        else {
            minn.push(Math.min(val, minn.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minn.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minn.peek();
    }
}
