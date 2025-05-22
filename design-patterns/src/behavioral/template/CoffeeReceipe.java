package behavioral.template;

public abstract class CoffeeReceipe {
    public void makeCoffee(){
        boilWater();
        brew();
        fillInCup();
        addCodiments();
    }
    public void boilWater() {
        System.out.println("boiling wtaer");
    }
    public void fillInCup(){
        System.out.println("filling the cup");
    }
    public abstract void brew();
    public abstract void addCodiments();
}
