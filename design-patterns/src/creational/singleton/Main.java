package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        s1.display();
        s2.display();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
