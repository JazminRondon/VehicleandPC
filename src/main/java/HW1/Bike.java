package HW1;

public class Bike extends Vehicle implements Rideable {


    public Bike(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);

    }



    @Override
    public int milesPerHour() {
    return 0;
    }
}
