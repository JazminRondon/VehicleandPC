package HW1;

public class Horse extends Vehicle implements Rideable {



    public Horse(String name, double price, int qty, float speed) {
        super(name, price, qty, speed);
    }



    @Override
    public int milesPerHour() {

        return (int) getSpeed();
    }
}
