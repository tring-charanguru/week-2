import java.util.Scanner;

class LinkedList
{
    Node head;
    
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if (head == null)
            head=newNode;
        else{
            Node c = head;
            while(c.next!=null){
                c=c.next;
            }
            c.next=newNode;
        }
    }
    public void insertAtBeginning(int data)
    {
        Node newNode=new Node(data);
        if (head == null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtSpecificPosn(int data, int pos)
{
    if (pos < 1)
    {
        System.out.println("Invalid Position");
        return;
    }
    if (pos == 1)
    {
        Node n = new Node(data);
        n.next = head;
        head = n;
        return;
    }
    Node prev = head;
    int count = 1;
    while (count < pos - 1 && prev != null) {
        prev = prev.next;
        count++;
    }
    if (prev == null) {
        System.out.println("Invalid position!");
    } else {
        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;
    }
}
    void display(){
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String ar[])
    {
        LinkedList link = new LinkedList();
        Scanner io=new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.println("1.Insert Data on the End");
            System.out.println("2.Insert on the Beginning");
            System.out.println("3.Display the linklist");
            System.out.println("4.Exit");
            n=io.nextInt();
            io.nextLine();
            if (n==1)
            {
                System.out.print("Enter the data:");
                int data=io.nextInt();
                io.nextLine();
                link.insertAtEnd(data);
            }
            else if (n==2)
            {
                System.out.print("Enter the data:");
                int data=io.nextInt();
                io.nextLine();
                link.insertAtBeginning(data);
            }
           else if(n==3)
           {
            link.display();
           } 
           else{
            break;
           }
        }
        io.close();
    }
}