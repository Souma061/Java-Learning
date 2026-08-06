/*
Write a Java program that implements a Stack class for integers. Write the basic operations of Stack
like push(), pop(), overflow(), underflow().
 */
import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }


}

public class twentyNine {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped element: " + s.pop());
        s.display();
        s.push(40);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}
