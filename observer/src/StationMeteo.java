import java.util.ArrayList;
import java.util.List;

public class StationMeteo {
    private List<observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(observer observer){
        observers.add(observer);
    }
    public void removeObserver(observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (observer observer : observers){
            observer.update(temperature);
        }
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
