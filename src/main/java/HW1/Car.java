package HW1;

public class Car extends Vehicle  {


 public Car(String name, double price, int qty, float speed) {
  super(name, price, qty, speed);
 }



 @Override
 public int milesPerHour() {

  return 0;
 }

}
