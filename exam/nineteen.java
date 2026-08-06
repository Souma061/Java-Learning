/*
    Write a Java program to implement a Queue using a custom class MyQueue. The class should have
data members : front, rear, and an array to store the queue elements. Implement the following member
functions :
. enqueue() - to insert an element into the queue
dequeue() - to remove an element from the queue
display() - to show all elements of the queue along with its current status
Also, define a default constructor to initialize the queue's data members.

*/

class MyQueue {
    int front;
    int rear;
    int arr[];

    MyQueue() {
        front = -1;
        rear = -1;
        arr = new int[5];
    }

    void enqueue(int item) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is full. Can't enqueue " + item);

        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = item;
            System.out.println("Enqueued: " + item);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.Can't dequeue");

        } else {
            System.out.println("Dequeued: " + arr[front]);
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;

        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Front: " + front + ", Rear: " + rear);
    }
}

public class nineteen {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();

    }
}
