package HW1;


public class VehicleApp extends Product {

    public VehicleApp(String name) {
        super(name);

    }



    public static void printVehicleNamesandPrice(Vehicle vehicle) {
   //     int x = 0;
  //      while (x < vehicle.length) {
            System.out.println(vehicle.getName() + vehicle.getPrice());
//            x++;
        }

    }
