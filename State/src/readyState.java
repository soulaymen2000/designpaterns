public class readyState extends state {
    public readyState(phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new offState(phone));
        return phone.lock();
    }
}
