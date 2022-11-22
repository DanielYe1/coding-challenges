package structures;

import java.util.Stack;

class QueueWIthTwoStacks {

    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public QueueWIthTwoStacks() {

    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        if(st2.isEmpty()){
            forward();
        }
        return st2.pop();
    }

    public int peek() {
        if(st2.isEmpty()){
            forward();
        }
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    private void forward(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
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