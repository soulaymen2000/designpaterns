public class LockedState extends state {
    public LockedState(phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new readyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOffOn() {
        phone.setState(new offState(phone));
        return phone.lock();
    }
}
