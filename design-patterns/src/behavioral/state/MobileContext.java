package behavioral.state;

public class MobileContext {
    private MobileAlertState currentState;
    public MobileContext() {
        currentState=new Ringing();
    }
    public void setCurrentState(MobileAlertState state) {
        currentState=state;
    }
    public void alert(){
        currentState.alert();
    }
}
