public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(200, 290000, 150);
        Toyoto toy = new Toyoto(100, 2000, 12.4f);
        bmw.price();
        bmw.speed();
        bmw.Name("THE FIRST-EVER BMW i5 M60 xDRIVE");
        toy.price();
        toy.speed();
        toy.Name("Toyota Urban Cruiser Hyryder");
    }
}