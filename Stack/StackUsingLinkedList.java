import java.util.Scanner;
public class StackUsingLinkedList{
    Node top=null;
    public void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println(data+" pushed to stack");
    }
    public boolean IsEmpty()
    {
        return top==null;
    }
    public void pop()
    {
        if(IsEmpty())
        {
            System.out.println("Stack Underflow....");
        }
        else{
            int popping = top.data;
            top=top.next;
            System.out.println("The poped data is:"+popping);
        }
    }
    public void peek(){
        if(IsEmpty())
        {
            System.out.println("Stack is empty....");
        }
        else{
            int peeking = top.data;
            System.out.println("The peeked data is:"+peeking);
        }
    }
    public void display(){
        if(IsEmpty())
        {
            System.out.println("Stack is empty....");
        }
        else{
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    
    }
        public static void main(String ar[]){
            StackUsingLinkedList stack = new StackUsingLinkedList();
        Scanner io = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. IsEmpty");
            System.out.println("*. Exit");
            n = io.nextInt();
            io.nextLine();

            if (n == 1) {
                System.out.print("Enter the data: ");
                int data = io.nextInt();
                stack.push(data);
            } else if (n == 2) {
                stack.pop();
            } else if (n == 3) {
                stack.peek();
            } else if (n == 4) {
                stack.display();
            } else if (n == 5) {
                if (stack.IsEmpty()) {
                    System.out.println("stack is Empty");
                } else {
                    System.out.println("stack is not Empty");
                }
            } else {
                break; 
            }
        }
        io.close();
        }
}