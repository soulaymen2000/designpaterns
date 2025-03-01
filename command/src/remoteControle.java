public class remoteControle{
    private command command;
    public void setControle(command command){
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
