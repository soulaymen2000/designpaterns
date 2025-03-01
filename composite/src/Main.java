//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        directory root = new directory("root");
        file file1 = new file("file1");
        file file2 = new file("file2");
        directory dir = new directory("dir");

        root.addChild(file1);
        root.addChild(file2);
        root.addChild(dir);

        root.display();
    }
}