import java.util.ArrayList;

/**
 * Created by yingzong on 11/8/15.
 */
public class MinStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();
    int min = Integer.MAX_VALUE;
    public void push(int x) {
        if(x < min){
            min = x;
        }
        stack.add(0,x);
    }

    public void pop() {
        stack.remove(0);

    }

    public int top() {
        return stack.get(0);

    }

    public int getMin() {
        return min;

    }
}
