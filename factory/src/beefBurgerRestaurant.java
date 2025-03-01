public class beefBurgerRestaurant extends restaurant{
    @Override
    public burger createBurger() {
        return new beefBurger();
    }
}
