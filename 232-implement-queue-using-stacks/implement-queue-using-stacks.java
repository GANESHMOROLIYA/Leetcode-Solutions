class MyQueue {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        if (s.size() == 0) {
            s.push(x);
        } else {
            while (s.size() > 0) {
                helper.push(s.pop());
            }
            s.push(x);
            while (helper.size() > 0) {
                s.push(helper.pop());
            }
        }
    }

    public int pop() {
        return s.pop();
    }

    public int peek() {
        return s.peek();

    }

    public boolean empty() {
        if (s.size() == 0)
            return true;
        else
            return false;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */