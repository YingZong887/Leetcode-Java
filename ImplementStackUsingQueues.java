import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yingzong on 11/8/15.
 */
public class ImplementStackUsingQueues {
    // Push element x onto stack.
    LinkedList<Integer> stack = new LinkedList<>();
    LinkedList<Integer> tmp = new LinkedList<>();


    public void push(int x) {
        stack.push(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        stack.pop();

    }

    // Get the top element.
    public int top() {
        return stack.getFirst();

    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();

    }
}
