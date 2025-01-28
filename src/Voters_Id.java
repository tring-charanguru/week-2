import java.util.Random;
public class Voters_Id {
    String name;
    int age;
    long _id;
    public boolean applyVotersId(String name,int age) throws AgeNotELigible {
        Random rd = new Random();
        if (age < 18)
            throw new AgeNotELigible("The age should be greater than or equal to 18");
        else {
            this.name = name;
            this.age = age;
            _id = 100000 + rd.nextInt(900000);
        }
        return true;

    }
    public long checkMyVoterId(){
            return _id;


    }
    public void ViewFullDetails()
    {
            System.out.println("Your Name:"+name);
            System.out.println("Your Age:"+age);
            System.out.println("Your Voter id:"+_id);

    }

}