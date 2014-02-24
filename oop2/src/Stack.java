import java.util.ArrayList;

/**
 * Created by ShawnyBunny on 24/02/14.
 */
public class Stack<String> {
    private int size;
    private int top = 0;

    //private Object[] stack;
    private ArrayList<String> stack;

    public Stack(int s) {
        size = s;
        //stack = new Object[size];
        stack = new ArrayList<String>(size);
    }

    public void push(String s) {
        //stack[top] = o;
        stack.add(top, s);
        top++;
    }

    public Object pop() {
        top--;
        //return stack[top];
        return stack.remove(top);
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public boolean isFull() {
        return (top == size);
    }

}
