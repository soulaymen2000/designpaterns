//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        product product = new product("pc", 2100);

        product.setStrategy(new discountPercentage(10));
        System.out.println("price after discount : " + product.getNewPrice());

        product.setStrategy(new fixDiscount(100));
        System.out.println("price after discount : " + product.getNewPrice());

        product.setStrategy(new noDiscount());
        System.out.println("price after discount : " + product.getNewPrice());
    }
}