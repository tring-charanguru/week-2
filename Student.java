public class Student {
    private String name;
    private double mark = -1;
    private int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno; 
    }

    void getname() {
        System.out.println("Name of the student: " + name);
        System.out.println();
    }

    void setname(String name) {
        this.name = name;
        System.out.println("The name updated successfully....");
        System.out.println();
    }

    int getrollno() {
        return rollno;
    }

    double getmark() {
        return mark;
    }
    void setmark(double mark) {
        this.mark = mark;
        System.out.println("The mark updated successfully....");
        System.out.println();
    }
    void getDetail() {
        System.out.println("Name of the student: " + name);
        System.out.println("Rollno of the student: " + rollno);
        if(mark!=-1)
            System.out.println("Mark of the student for current sem: " + mark);
        else{
            System.out.println("The mark hasn't been assigned yet.............");
        }
    }

}
