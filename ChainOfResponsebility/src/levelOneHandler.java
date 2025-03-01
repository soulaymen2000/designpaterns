public class levelOneHandler implements accessHandler{
    private accessHandler nextHandler;

    @Override
    public void setNextHandler(accessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAccess(String level) {
        if(level.equals("levelOne")){
            System.out.println("access authorized to levelOne");
        }else if(nextHandler!=null){
            nextHandler.handleAccess(level);
        }else{
            System.out.println("access denied");
        }
    }
}
