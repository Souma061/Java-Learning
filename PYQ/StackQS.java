import java.util.Stack;

/*
 Create a basic stack data structure using arrays. Include methods for push, pop, and checking if the
stack is empty.
 */
public class StackQS {
    private Stack<Integer> stack;

    public StackQS() {
        stack = new Stack<>();
    }

    public void isEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void push(int val) {
        stack.push(val);
        System.out.println("Pushed " + val + " to stack");
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int val = stack.pop();
            System.out.println("Popped " + val + " from stack");
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (!stack.isEmpty()) {
            int val = stack.peek();
            System.out.println("Top element is " + val);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        StackQS stack = new StackQS();
        stack.isEmpty();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.push(30);
    }
}
