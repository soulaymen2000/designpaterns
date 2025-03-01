//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pizzaBuilder pb = new concretePizzaBuilder();
        chef chef = new chef(pb);

        chef.construirePizza();
        pizza pizza = pb.getPizza();

        System.out.println(pizza);
    }
}