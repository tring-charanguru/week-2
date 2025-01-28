import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeNotELigible {
        Scanner sc=new Scanner(System.in);
       Voters_Id applicant=null;

       int n=0;
       while(true){
           System.out.println("1.apply votercard\n2.Display the voter id number\n3.Display the voter details\n*.Exit");
           n=sc.nextInt();
           sc.nextLine();
           if(n==1)
           {
               if (applicant==null)
               {
                   System.out.println("Enter your name:");
                   String name=sc.nextLine();
                   System.out.println("Enter your Age:");
                   int age=sc.nextInt();
                   applicant =new Voters_Id();
                   try {
                       boolean a= applicant.applyVotersId(name, age);
                       if(a){
                           System.out.println("Applied Successfully");
                       }

                   }
                   catch (Exception e)
                   {
                       System.out.println(e);
                       applicant=null;
                   }
               }
               else{
                   System.out.println("Oject is already initialised.. Do you want to continue...(0,1)");
                   int flag=sc.nextInt();
                   sc.nextLine();
                   if(flag==0)
                   {
                       continue;
                   }
                   else{
                       applicant=null;
                       System.out.println("Enter your name:");
                       String name=sc.nextLine();
                       System.out.println("Enter your Age:");
                       int age=sc.nextInt();
                       applicant =new Voters_Id();
                       try {
                           boolean a= applicant.applyVotersId(name, age);
                           if(a){
                               System.out.println("Applied Successfully");
                           }

                       }
                       catch (Exception e)
                       {
                           System.out.println(e);
                           applicant=null;
                       }

                   }

               }
           }
           else if(n==2) {
               if(applicant==null)
                   System.out.println("You Haven't applied yet........");
               else{
                   long id= applicant.checkMyVoterId();
                   System.out.println("Your Voter id is:"+id);
               }

           }
           else if(n==3)
           {
               if(applicant==null)
                   System.out.println("You Haven't applied yet........");
               else
                   applicant.ViewFullDetails();
           }
           else{
               System.exit(0);
           }

       }
    }
}