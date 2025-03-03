package creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;

public class Car implements Prototype{
    private String model;
    private String color;
    private int hp;
    private ArrayList<String> engine=new ArrayList<>();

    public Car(String model, String color, int hp) {
        this.model = model;
        this.color = color;
        this.hp = hp;

    }
    public Car(Car car){
        this.model = car.model;
        this.color = car.color;
        this.hp = car.hp;
        this.engine=new ArrayList<>(car.engine);
    }
    public Car clone(){
        return new Car(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", hp=" + hp +
                ", engine=" + engine +
                '}';
    }

    public ArrayList<String> getEngine() {
        return engine;
    }

    public void setEngine(ArrayList<String> engine) {
        this.engine = engine;
    }
}
