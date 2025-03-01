public class product {
    private String name;
    private int price;
    private discountStrategy strategy;
    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void setStrategy(discountStrategy strategy) {
        this.strategy = strategy;
    }
    public double getNewPrice() {
        return strategy.applyDiscount(price);
    }
}
