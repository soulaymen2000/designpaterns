public class veggieBurgerRestaurant extends restaurant{
    @Override
    public burger createBurger() {
        return new veggieBurger();
    }
}
