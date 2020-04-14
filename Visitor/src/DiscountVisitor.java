public class DiscountVisitor implements Visitor{
    @Override
    public double Visitor(Shirt shirtItem) {
        return shirtItem.getPrice()*0.50;
    }

    @Override
    public double Visitor(TShirt tShirtItem) {
        return tShirtItem.getPrice()*0.8;
    }

    @Override
    public double Visitor(Jacket jacketItem) {
        return jacketItem.getPrice()*0.3;
    }
}
