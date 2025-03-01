import javax.management.monitor.Monitor;

public class MSImanifacturer extends Company {
    public gpu createGpu(){
        return new MSIgpu();
    }
    public monitor createMonitor(){
        return new MSImonitor();
    }
}
