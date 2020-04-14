import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat decimalFormat=new DecimalFormat("#.##");
    DiscountVisitor discountVisitor=new DiscountVisitor();
    public TaxVisitor() {
    }

    @Override
    public double Visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with tax");
        return shirtItem.accept(discountVisitor)*1.20;
    }

    @Override
    public double Visitor(TShirt tShirtItem) {
        System.out.println("TShirt final price with tax");
        return tShirtItem.accept(discountVisitor)*1.50;
    }

    @Override
    public double Visitor(Jacket jacketItem) {
        System.out.println("Jacket final price with tax");
        return jacketItem.accept(discountVisitor)*1.10;
    }
}
