//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StationMeteo sm = new StationMeteo();
        showTemperature st = new showTemperature();
        AlarmTemperature at = new AlarmTemperature();

        sm.addObserver(st);
        sm.addObserver(at);

        sm.setTemperature(32);
    }
}