package HW1;

public class Truck extends Vehicle {
    public Truck(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);
    }

    public Truck(String name) {
        super(name);
    }

    @Override
    public int milesPerHour() {

        return 0;
    }

}
