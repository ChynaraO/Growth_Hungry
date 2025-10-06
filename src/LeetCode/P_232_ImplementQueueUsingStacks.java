package LeetCode;

import java.util.Stack;

public class P_232_ImplementQueueUsingStacks {
    public static void main(String[] args) {
  MyQueue  obj = new MyQueue();
 obj.push(6);
 obj.push(7);
 int param_2 = obj.pop();
 int param_3 = obj.peek();
 boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
    class MyQueue {
        Stack<Integer> input = new Stack();
        Stack<Integer> output = new Stack();

        public MyQueue() {}

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            int x = peek();
            output.pop();
            return x;
        }

        public int peek() {
            if(output.empty()){
                while(!input.empty()){
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.empty() && output.empty();
        }
    }

