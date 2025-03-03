package creational.builder;

public class Director {
    public void buildToyota(CarBuilder builder) {
        builder.setMake("toyota");
    }
    public void buildPorsche(CarBuilder builder) {
        builder.setMake("Porsche");
    }
}
