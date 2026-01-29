
interface Rentable {

    void rent();

    void returnVehicle();
}

class Car implements Rentable {

    @Override
    public void rent() {
        System.out.println("Car rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements Rentable {

    @Override
    public void rent() {
        System.out.println("Bike rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

public class RentalSystem {

    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();

        car.rent();
        bike.rent();

        car.returnVehicle();
        bike.returnVehicle();
    }
}
