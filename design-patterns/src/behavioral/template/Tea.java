package behavioral.template;

public class Tea extends CoffeeReceipe{
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCodiments() {
        System.out.println("Adding lemon");
    }
}
