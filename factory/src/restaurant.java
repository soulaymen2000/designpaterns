public abstract class restaurant {
    public burger orderBurger(){
        burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract burger createBurger();
}
