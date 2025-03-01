public class concretePizzaBuilder implements pizzaBuilder{
    private pizza pizza;
    public concretePizzaBuilder(){
        this.pizza = new pizza();
    }

    @Override
    public void consruireTaille() {
        pizza.setTaille("grande");
    }

    @Override
    public void construireTypeDeCroute() {
        pizza.setTypeDeCroute("fine");
    }

    @Override
    public void ajouterGarnitures() {
        pizza.addGarniture("pepperoni");
        pizza.addGarniture("gorgonzolla");
    }
    public pizza getPizza() {
        return pizza;
    }
}
