import java.util.Scanner;

public class golnaz_constructor {
    public static void main(String[] args) {
        /*
        Make a class of car, constructors and several methods to accelerate, refuel to continue car driving.
        From the main class, user can accelerate, break or even refuel the car.

              */

        Car1 car = new Car1("Toyota", "RAV4", 40);

        Scanner sc = new Scanner(System.in);

        while(true) {
             System.out.println("a=accelerate b=break x=exit");
             String input = sc.nextLine();

             if (input.equals("a")) {
             car.accelerate();
    }
            else if (input.equals("b")) {
            car.brake();
        }
            else if(input.equals("x")){
            break;
            }
      }
    }
}

class Car1 {
     String model;
     String brand;
     int amount;
     int amountOfFuel;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Car1() {
        model = "";
        brand = "";
        amountOfFuel = 0;
    }
    // Parametrized constructors
    public Car1(String model, String brand, int amountOfFuel) {
        this.model = model;
        this.brand = brand;
        this.amountOfFuel = amountOfFuel;
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel: " + amountOfFuel);

    }
        // To refuel the Car
        public void refuel(int amount) {
            int sum = amount + amountOfFuel;
            System.out.println("Fuel in the tank: " +amountOfFuel);
            System.out.println("Refuel: " + amount);
            System.out.println("Fuel in the tank after the refuel: " +sum);

}
        // Break Method

       public void brake() {
        System.out.println("Car is breaking");
    }
        // To accelerate the cra and validation for fuel

        public void accelerate() {

        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating");
        }
        amountOfFuel--;
    }

    public void printData() {
        System.out.println("Brand: " +brand);
        System.out.println("Model: "+model);
        System.out.println("Fuel: "+amountOfFuel);
    }
}
