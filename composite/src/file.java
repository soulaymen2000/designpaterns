public class file implements fileComponent{
    private String fileName;

    public file(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }
}
