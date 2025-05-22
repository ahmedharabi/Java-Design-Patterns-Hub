package behavioral.state;

public class Main {
    public static void main(String[] args){
        MobileContext m=new MobileContext();
        m.alert();
        m.setCurrentState(new Silent());
        m.alert();
    }
}
