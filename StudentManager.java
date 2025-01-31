import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
    List<Student> s=new ArrayList<>();
    Scanner io=new Scanner(System.in);
    // void registerStudent(String name,int rollno)
    // {
    //     Student studentobj = new Student(name,rollno);
    //     s.add(studentobj);
    //     System.out.println("Student added successfully......");
    //     System.out.println();
    // }
    void registerStudent(String name) {
        int rollno;
        while (true) {
            System.out.print("Enter the rollno: ");
            rollno = io.nextInt();
            io.nextLine();
            boolean exists=false;
            for (Student i: s) 
            {
                if (i.getrollno() == rollno) 
                {
                    exists = true;
                    break;
                }
            }
            if (exists)
            {
                System.out.println("Roll number already exists,Please enter a unique roll number.");
                System.out.println();
            } 
            else 
            {
                Student studentobj = new Student(name, rollno);
                s.add(studentobj);
                System.out.println("Student added successfully......");
                System.out.println();
                break;
            }
        }
    }

    void assignmark()
    {
        if(s.isEmpty())
        {
            System.out.println("No students are there...........");
            System.out.println();
            return;
        }
        System.out.print("Enter the rollno where the mark to be assigned:");
        int rollno=io.nextInt();
        System.out.println();
        for(Student i:s){
            if(rollno==i.getrollno())
            {
                if(i.getmark()==-1)
                {
                    System.out.print("Enter your mark:");
                    double mark=io.nextDouble();
                    i.setmark(mark);
                    return;
                }
                else{
                    System.out.println("The mark is already assigned...");
                    System.out.println();
                    return;
                }
            }
        }
            System.out.println("The rollno is not available");
            System.out.println();
        
    }
    void updateMark()
    {
        if(s.isEmpty())
        {
            System.out.println("No students are there...........");
            System.out.println();
            return;
        }
        System.out.print("Enter the rollno where the mark to be updated:");
        int rollno=io.nextInt();
        System.out.println();
        for(Student i:s){
            if(rollno==i.getrollno())
            {
                if(i.getmark()!=-1){
                System.out.print("Enter the mark to be changed:...");
                double mark=io.nextDouble();
                i.setmark(mark);
                return;
                }
                else{
                    System.out.println("You cant update the mark without assigning");
                    System.out.println();
                    return;
                }
            }
        }
            System.out.println("The rollno is not available");
            System.out.println();
        
    }
    void displayDetails()
    {
        if(s.isEmpty())
        {
            System.out.println("No students are There....");
            System.out.println("");
            return;
        }
        System.out.println("__________________________________________________________________");
         for(Student i:s)
         {
            i.getDetail();
            System.out.println("__________________________________________________________________");
         }
    }
    void fetchByRollno()
    {
        if(s.isEmpty())
        {
            System.out.println("No students are There....");
            System.out.println("");
            return;
        }
        System.out.println("Enter the rollno:");
        int rollno=io.nextInt();
        System.out.println("________________________________________________________________");
         for(Student i:s)
         {
            if(i.getrollno()==rollno){
                i.getDetail();
                System.out.println("_________________________________________________________");
                return;
            }
         }
            System.out.println("No student in that rollno............");
            System.out.println();
         
    }
    void deleteByrollno()
    {
        if(s.isEmpty())
        {
            System.out.println("There are no students......");
            System.out.println("");
            return;
        }
        System.out.println("Enter the rollno to be deleted:");
        int rollno=io.nextInt();
        System.out.println("____________________________________________");
         for(Student i:s)
         {
            if(i.getrollno()==rollno){
                s.remove(i);
                System.out.println("The member is removed.....");
                System.out.println();
                return;
            }
         }
            System.out.println("No student in that rollno............");
            System.out.println();
         
    }
}
