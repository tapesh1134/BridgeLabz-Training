package org.tapesh;

import org.json.JSONObject;

class Car{
    private String brand;
    private String name;
    private String color;
    private int seats;

    public Car(String brand, String name, String color, int seats) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }
}

public class CarObjectJson {
    public static void main(String[] args) {
        Car car = new Car("Suzuki","Wagon-r","white",5);
        JSONObject json = new JSONObject();
        json.put("Brand",car.getBrand());
        json.put("Name",car.getName());
        json.put("Color",car.getColor());
        json.put("Seats",car.getSeats());
        System.out.println("Car details");
        System.out.println(json);
    }
}
