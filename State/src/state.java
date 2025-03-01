public abstract class state {
    protected phone phone;

    public state(phone phone) {
        this.phone = phone;
    }
    public abstract String onHome();
    public abstract String onOffOn();
}
