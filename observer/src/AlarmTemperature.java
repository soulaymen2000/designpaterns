import java.util.Observer;

public class AlarmTemperature implements observer {
    @Override
    public void update(float temperature) {
        if (temperature >= 30) {
            System.out.println("Alarm temperature is higher than 30! "+temperature);
        }
    }
}
