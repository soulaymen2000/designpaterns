public class fixDiscount implements discountStrategy {
    private double discount;
    public fixDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}
