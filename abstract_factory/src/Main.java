//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Company msi = new MSImanifacturer();
        monitor msiMonitor = msi.createMonitor();
        gpu msiGpu = msi.createGpu();

        Company asus = new ASUSmanifactrurer();
        monitor asusMonitor = asus.createMonitor();
        gpu asusGpu = asus.createGpu();
    }
}