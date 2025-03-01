import java.util.Observable;
import java.util.Observer;

public class showTemperature implements observer {
    @Override
    public void update(float temperature) {
        System.out.println("temperature is : "+temperature);
    }
}
