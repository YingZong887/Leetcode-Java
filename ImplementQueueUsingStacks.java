import java.util.Stack;

/**
 * Created by yingzong on 11/8/15.
 */
public class ImplementQueueUsingStacks {
    // Push element x to the back of queue.
    Stack<Integer> queue = new Stack<Integer>();
    Stack<Integer> tmp = new Stack<Integer>();

    public void push(int x) {
        while(!queue.isEmpty()){
            tmp.push(queue.pop());
        }
        queue.push(x);
        while(!tmp.isEmpty()){
            queue.push(tmp.pop());
        }

    }

    // Removes the element from in front of queue.
    public void pop() {
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.isEmpty();

    }
}
