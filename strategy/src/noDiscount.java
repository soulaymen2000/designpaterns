public class noDiscount implements discountStrategy{
    public double applyDiscount(double price) {
        return price;
    }
}
