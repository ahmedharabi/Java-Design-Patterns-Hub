package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("toyota","black",200);
        Car c2=c1.clone();
        c2.getEngine().add("waa bro");
        System.out.println(c1);
        System.out.println(c2);
    }
}
