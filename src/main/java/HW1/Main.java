package HW1;

public class Main {
    public static void main(String[] args) {


        //Rideable objects
        Rollercoaster rollercoaster = new Rollercoaster();
        //Vehicle object
        Car car = new Car("Wrangler ", 60000, 5, 160);
        Bike bike = new Bike("Mountain ", 1000, 10, 20);
        Truck truck = new Truck("Pick Up ", 50000, 1, 100);
        Horse horse = new Horse("Stallion ", 5000, 1, 50);


        //Arrays
        Vehicle[] vehicle = {car, bike, truck, horse};
        Rideable[] rideable = {bike, horse, rollercoaster};


//        VehicleApp.printVehicleNamesandPrice(vehicle);
        for (int x = 0; x < vehicle.length; x++) {
            VehicleApp.printVehicleNamesandPrice(vehicle[x]);
        }
    VehicleApp.getSpeedOfRideableObjects(rideable);
    }
}



