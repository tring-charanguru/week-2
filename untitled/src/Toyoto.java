public class Toyoto extends Car {
    float cap;
    Toyoto(int speed, float price,float cap) {
        super(speed, price);
        this.cap=cap;
    }
    @Override
    void capacity()
    {
        System.out.println("The capacity of BMW is:"+cap);
    }
    void Name(String name)
    {
            System.out.println("The Model of the Toyoto car "+name);
    }

}
