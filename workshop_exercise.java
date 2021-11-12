public class workshop_exercise {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.setRange(0);
        System.out.println(car2.getRange());
        car2.range();
        car2.accelerate();
        car2.tank(25);
        System.out.println("----------------------------");
        ElectricCar electricCar = new ElectricCar("American Car" ,"Audi A8");
        ElectricCar electricCar1 = new ElectricCar();
        ElectricCar electricCar2 = new ElectricCar();
        electricCar1.tank(20);
        electricCar1.range();
        electricCar1.accelerate();
        electricCar2.setRange(30);
        System.out.println("The range of the electric class is "+ electricCar2.getRange());
        electricCar2.range();
        electricCar2.accelerate();
        electricCar2.tank(40);


    }
}
class Car2 {
    private String name;
    private String brand;
    private double range;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public Car2() {
        name = "Default Name";
        brand = "Default Brand";
        range = 0;
        System.out.println("I am default constructor " + name);

    }
    public Car2(String name , String brand){
        this.name = name;
        this.brand = brand;
        System.out.println("The name of the car is " + name + " and the brand is " + brand);
    }
    public double tank(double input){
        if (input > 0){
            System.out.println("The tank is " + input*5);
        }
        else {
            System.out.println("Tank amount cannot be 0!");
        }
        return input;
    }
    public void  range(){
        System.out.println("“car range is: -\n" + range + " value of range KM”.");
    }
    public void accelerate(){
        if(range > 0){
            System.out.println("You are accelerating!");
        }
        else {
            System.out.println("Make sure tank is full");
        }
    }
}
class ElectricCar extends Car2{
    private String name;
    private String brand;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public ElectricCar(){
        name = "Default";
        brand = "Default brand";
        System.out.println("This is the default constructor of electric class");
    }
    public ElectricCar(String name , String brand){
        this.name =  name;
        this.brand = brand;
        System.out.println("The name of the Car is "+name+ " and the brand is "+brand);
    }
    @Override
    public void setRange(double input){
        super.setRange(input*5);
        System.out.println("The range now is " +getRange());
    }
    public void range(){
        System.out.println("******Electric car******");
        super.range();
    }
    @Override
    public double tank(double input){
        System.out.println("You cannot tank gas into the electric car!");
        return input * 0;
    }

}
