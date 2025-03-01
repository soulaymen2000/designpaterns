public class phone {
    private state state;
    public phone(){
        state = new offState(this);
    }
    public void setState(state state){
        this.state = state;
    }
    public String lock(){
        return "lock";
    }
    public String unlock(){
        return "unlock";
    }
    public String home(){
        return "home";
    }
    public String turnOn(){
        return "turn on";
    }
}
