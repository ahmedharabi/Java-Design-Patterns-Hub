package creational.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        director.buildToyota(carBuilder);
        Car car = carBuilder.setModel("supra mk5").setYear("2022").build();
        director.buildPorsche(carBuilder);
        Car car1=carBuilder.setModel("cayenne turbo gt").setYear("2024").build();
        System.out.println(car1.toString());
    }
}
