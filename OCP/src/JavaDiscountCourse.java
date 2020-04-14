public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public double getOriginPrice(){
        return super.getPrice();
    }

    public double getPrice(){
        return super.getPrice()*0.80;
    }
}
