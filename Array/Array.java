import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
    Scanner io=new Scanner(System.in);
    int n;
    System.out.print("Enter the size of an array:");
    n=io.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("a["+i+"]:");
        a[i]=io.nextInt();
        System.out.println();
    }
    System.out.println("Enter the element to be searched:");
    int search=io.nextInt();
    for(int i=0;i<n;i++)
    {
        if(search==a[i])
        {
            System.out.println("The "+search+" is in locn of "+i);
            System.exit(0);
        }
    }
    System.out.println("The element is not in the array........");

   } 
}
