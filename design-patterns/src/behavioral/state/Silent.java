package behavioral.state;

public class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Silent");
    }
}
