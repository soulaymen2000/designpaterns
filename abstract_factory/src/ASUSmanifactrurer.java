public class ASUSmanifactrurer extends Company {
    public gpu createGpu(){
        return new ASUSgpu();
    }
    public monitor createMonitor(){
        return new ASUSmonitor();
    }
}
