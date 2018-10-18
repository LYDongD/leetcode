import java.util.LinkedList;

public class MyQueue {

//    Implement the following operations of a queue using stacks.
//
//            push(x) -- Push element x to the back of queue.
//    pop() -- Removes the element from in front of queue.
//    peek() -- Get the front element.
//    empty() -- Return whether the queue is empty.

    private LinkedList<Integer> stackForPush;
    private LinkedList<Integer> stackForPop;
    private int firstIn;


    public MyQueue() {
        stackForPush = new LinkedList<>();
        stackForPop = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (stackForPush.isEmpty()){
            firstIn = x;
        }
        stackForPush.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackForPop.isEmpty()){
            while (!stackForPush.isEmpty()){
                stackForPop.push(stackForPush.pop());
            }
        }

        return stackForPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stackForPop.isEmpty()){
            return stackForPop.peek();
        }

        return firstIn;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackForPush.isEmpty() && stackForPop.isEmpty();
    }
}
