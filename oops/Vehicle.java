package oops;

 abstract class Vehicle {
      abstract void start();

     void wheel() {
         System.out.println("4");
     }
 }

class Car extends Vehicle{
    void start(){
        System.out.println("with key");
    }
}

class Scooter extends Vehicle{
    void start(){
        System.out.println("with kick");
    }

    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle();

        Car car = new Car();
        car.start();

        Scooter scooter = new Scooter();
        scooter.start();

    }
}




