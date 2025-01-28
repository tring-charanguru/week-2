abstract class Car {
    int speed;
    float price;
    Car(int speed,float price)
    {
        this.speed=speed;
        this.price=price;
    }
    void price()
    {
        System.out.println("The car price is:"+price);
    }
    void speed()
    {
        System.out.println("The Speed of the car is:"+speed);
    }

    abstract void capacity();
}
