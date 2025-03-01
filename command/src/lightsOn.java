public class lightsOn implements command{
    private light light;
    public lightsOn(light light) {
        this.light = light;
    }
    public void execute() {
        light.lightOn();
    }
}
