import java.util.Stack;

public class MinStack2 {


//    design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//    push(x) -- Push element x onto stack.
//    pop() -- Removes the element on top of the stack.
//    top() -- Get the top element.
//    getMin() -- Retrieve the minimum element in the stack.
//
//     Example:
//    MinStack minStack = new MinStack();
//    minStack.push(-2);
//    minStack.push(0);
//    minStack.push(-3);
//    minStack.getMin();   --> Returns -3.
//    minStack.pop();
//    minStack.top();      --> Returns 0.
//    minStack.getMin();   --> Returns -2.

    Stack<Integer> mainStack;
    Stack<Integer> minSelectStack;

    public MinStack2() {
        mainStack = new Stack<>();
        minSelectStack = new Stack<>();
    }

    public void push(int x) {

       mainStack.push(x);
       if (minSelectStack.isEmpty() || x <= minSelectStack.peek()){
           minSelectStack.push(x);
       }
    }

    public void pop() {
        if (minSelectStack.peek().equals(mainStack.pop())){
            minSelectStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minSelectStack.peek();
    }

    public static void main(String args[]) throws Exception {
        MinStack2 minStack = new MinStack2();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }


}
