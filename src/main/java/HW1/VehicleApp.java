package HW1;


public class VehicleApp {




    public static void printVehicleNamesandPrice(Vehicle vehicle) {
   //     int x = 0;
  //      while (x < vehicle.length) {
            System.out.println(vehicle.getName() + vehicle.getPrice());
//
        }
        public static void getSpeedOfRideableObjects(Rideable[] rideable){
        int x=0;
        while(x<rideable.length) {
            System.out.println(rideable[x].milesPerHour());
            x++;
        }
        }

    }
