//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        light l = new light();
        command lightsOn = new lightsOn(l);
        command lightsOff = new lightsOff(l);
        remoteControle rc = new remoteControle();

        rc.setControle(lightsOn);
        rc.pressButton();
        rc.setControle(lightsOff);
        rc.pressButton();
    }
}