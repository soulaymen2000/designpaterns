public class discountPercentage implements discountStrategy{
    private double percentage;
    public discountPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage/100);
    }
}
