import java.util.Scanner;
public class Main {
    public static void main(String ar[])
    {
        StudentManager manage=new StudentManager();
        Scanner io=new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("1.register to new student");
            System.out.println("2.Assign marks to students");
            System.out.println("3.Update the student mark");
            System.out.println("4.Display all the student details");
            System.out.println("5.Display specific student detail by rollno");
            System.out.println("6.Delete student by rollno");
            System.out.println(" *.Exit");
            num=io.nextInt();
            io.nextLine();
            if(num==1)
            {
                System.out.print("Enter the name:");
                    String name=io.nextLine();
                    manage.registerStudent(name);
            }
            else if(num==2)
            {
                manage.assignmark();
            }
            else if(num==3)
            {
                manage.updateMark();
            }
            else if(num==4)
            {
                manage.displayDetails();
            }
            else if(num==5)
            {
                manage.fetchByRollno();
            }
            else if(num==6)
            {
                manage.deleteByrollno();
            }
            else
            {
                System.exit(0);
            }
        }

    }
}
