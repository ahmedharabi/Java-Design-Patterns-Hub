package structural.decorator;

public class Lait extends BoissonDecorator {
    public Lait(Boisson boisson){
        super(boisson);
    }
    public String getDescription() {
        return boisson.getDescription()+" lait";
    }

    public double getPrix() {
        return boisson.getPrix()+0.5;
    }
}
