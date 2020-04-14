public class Car extends Vehicle {
    public Car(WorkShop workShop) {
        super(workShop);
    }

    @Override
    public void manufacture() {
        System.out.println("Car..");
        workShop.make();
    }
}
