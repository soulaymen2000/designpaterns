public class lightsOff implements command{
    private light light;
    public lightsOff(light light) {
        this.light = light;
    }
    public void execute() {
        light.lightOff();
    }
}
