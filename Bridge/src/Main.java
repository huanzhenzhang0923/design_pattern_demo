public class Main {
    public static void main(String[] args) {
        Vehicle Ford=new Car(new CarMake());
        Vehicle BMW=new Car(new BMWMake());
        Ford.manufacture();
        Vehicle BMX=new Bike(new BikeMake(),new BikeAssemble());
        BMX.manufacture();
        BMW.manufacture();
    }
}
