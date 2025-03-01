public class levelThreeHandler implements accessHandler{
    private accessHandler nextHandler;

    @Override
    public void setNextHandler(accessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAccess(String level) {
        if(level.equals("levelThree")){
            System.out.println("access authorized to levelThree");
        }else if(nextHandler!=null){
            nextHandler.handleAccess(level);
        }else{
            System.out.println("access denied");
        }
    }
}
