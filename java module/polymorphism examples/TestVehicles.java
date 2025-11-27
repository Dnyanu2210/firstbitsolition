package polymorphism;



class Vehicle
{
    String brand;
    String model;
    double price;
    

    Vehicle()
    {
        System.out.println("Called Default Constructor of Vehicle");
        this.brand = "Default Brand";
        this.model = "Default Model";
        this.price = 50000.00;
    }

    Vehicle(String a1, String a2, double a3)
    {
        System.out.println("Called Parameterized Constructor of Vehicle");
        this.brand = a1;
        this.model = a2;
        this.price = a3;
    }

    void display()
    {
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Price : " + this.price);
    }
    
    void brake() {
    	System.out.println("break Applied");
    }
} // Vehicle Ends


class Car extends Vehicle
{
    int numberOfDoors;
    String fuelType;

    Car()
    {
        super();
        System.out.println("Called Default Constructor of Car");
        this.numberOfDoors = 4;
        this.fuelType = "Petrol";
    }

    Car(String a1, String a2, double a3, int a4, String a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Car");
        this.numberOfDoors = a4;
        this.fuelType = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Number of Doors : " + this.numberOfDoors);
        System.out.println("Fuel Type       : " + this.fuelType);
        System.out.println("-----------------------------------");
    }
    void brake() {
    	System.out.println("Air break Applied");
    }
} // Car Ends


class Bike extends Vehicle
{
    int engineCC;
    String type;

    Bike()
    {
        super();
        System.out.println("Called Default Constructor of Bike");
        this.engineCC = 150;
        this.type = "Sports";
    }

    Bike(String a1, String a2, double a3, int a4, String a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Bike");
        this.engineCC = a4;
        this.type = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Engine CC : " + this.engineCC);
        System.out.println("Type      : " + this.type);
        System.out.println("-----------------------------------");
    }
    void brake() {
    	System.out.println("Disc break Applied");
    }
} // Bike Ends


class Truck extends Vehicle
{
    double loadCapacity;
    int numberOfWheels;

    Truck()
    {
        super();
        System.out.println("Called Default Constructor of Truck");
        this.loadCapacity = 10000.00;
        this.numberOfWheels = 6;
    }

    Truck(String a1, String a2, double a3, double a4, int a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Truck");
        this.loadCapacity = a4;
        this.numberOfWheels = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Load Capacity   : " + this.loadCapacity);
        System.out.println("Number of Wheels: " + this.numberOfWheels);
        System.out.println("-----------------------------------");
    }
    void brake() {
    	System.out.println("Drum break Applied");
    }
} // Truck Ends


class TestVehicle
{
    public static void main(String[] args)
    {  Vehicle C1;
    C1=new Vehicle();
         C1 = new Car(); 
         C1.brake();
        C1.display();

        C1 = new Bike("Yamaha", "R15", 175000.00, 155, "Sport");
        C1.brake();
        C1.display();

        C1 = new Truck("Tata", "Xenon", 850000.00, 12000.00, 8);
        C1.brake();
        C1.display();
    }
} // TestVehicle Ends
