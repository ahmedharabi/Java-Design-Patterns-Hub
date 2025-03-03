package creational.builder;

public class CarBuilder {
    private String make;
    private String model;
    private String year;
    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder setYear(String year) {
        this.year = year;
        return this;
    }
    public Car build() {
        return new Car(make, model, year);
    }
}
