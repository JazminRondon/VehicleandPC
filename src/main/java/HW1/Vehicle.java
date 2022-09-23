package HW1;
import HW1.Product;

public abstract class Vehicle extends Product {
    private static double price;
    private int qty;
    private float speed;

    private final double tax =0.15 ;

    public Vehicle(String name) {
        super(name);
    }

    public Vehicle(String name, double price, int qty, float speed) {
        super(name);
        this.price = price;
        this.qty = qty;
        this.speed = speed;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Vehicle.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double totalBeforeTax(){
        return price*qty;
    }
    public double calculateTax(){
        return price*tax;
    }

    public static void printVehicleNameandPrice(Vehicle[] vehicle) {
        int x = 0;
        while (x < vehicle.length) {
            System.out.println(name + price);
            x++;
        }
    }
}
