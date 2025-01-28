public class BMW extends Car{
    float cap;
    BMW(int speed ,float price,float cap)
    {
        super(speed,price);
        this.cap=cap;
    }
    @Override
    void capacity()
    {
        System.out.println("The capacity of BMW is:"+cap);
    }
    void Name(String name)
    {
        System.out.println("The Model of the BMW car "+name);
    }

}
