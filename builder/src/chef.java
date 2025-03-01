public class chef {
    private pizzaBuilder pizzaBuilder;

    public chef(pizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public void construirePizza(){
        pizzaBuilder.consruireTaille();
        pizzaBuilder.construireTypeDeCroute();
        pizzaBuilder.ajouterGarnitures();
    }
}
