public interface accessHandler {
    void setNextHandler(accessHandler nextHandler);
    void handleAccess(String level);
}
