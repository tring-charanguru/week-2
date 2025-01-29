import java.util.Scanner;

public class QueuesUsingLinkedList {
    Node front;
    Node rear;

    QueuesUsingLinkedList() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Data Enqueued");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return;
        }
        Node removedData = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued " + removedData.data);
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("The Peeked data is: " + front.data);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue items:");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        QueuesUsingLinkedList queue = new QueuesUsingLinkedList();
        Scanner io = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. IsEmpty");
            System.out.println("*. Exit");
            n = io.nextInt();
            io.nextLine();

            if (n == 1) {
                System.out.print("Enter the data: ");
                int data = io.nextInt();
                queue.enqueue(data);
            } else if (n == 2) {
                queue.dequeue();
            } else if (n == 3) {
                queue.peek();
            } else if (n == 4) {
                queue.display();
            } else if (n == 5) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is Empty");
                } else {
                    System.out.println("Queue is not Empty");
                }
            } else {
                break; 
            }
        }
        io.close();
    }
}
