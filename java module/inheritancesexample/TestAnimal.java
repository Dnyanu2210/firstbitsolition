package javademo;

class Animal
{
    String name;
    String type;
    int age;

    Animal()
    {
        System.out.println("Called Default Constructor of Animal");
        this.name = "Default Animal";
        this.type = "Unknown";
        this.age = 0;
    }

    Animal(String a1, String a2, int a3)
    {
        System.out.println("Called Parameterized Constructor of Animal");
        this.name = a1;
        this.type = a2;
        this.age = a3;
    }

    void display()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Age  : " + this.age);
    }
} // Animal Ends



class Dog extends Animal
{
    String breed;
    double weight;

    Dog()
    {
        super();
        System.out.println("Called Default Constructor of Dog");
        this.breed = "Default Breed";
        this.weight = 10.0;
    }

    Dog(String a1, String a2, int a3, String a4, double a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Dog");
        this.breed = a4;
        this.weight = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Breed  : " + this.breed);
        System.out.println("Weight : " + this.weight);
        System.out.println("-----------------------------------");
    }
} // Dog Ends



class Cat extends Animal
{
    String color;
    boolean indoor;

    Cat()
    {
        super();
        System.out.println("Called Default Constructor of Cat");
        this.color = "White";
        this.indoor = true;
    }

    Cat(String a1, String a2, int a3, String a4, boolean a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Cat");
        this.color = a4;
        this.indoor = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Color  : " + this.color);
        System.out.println("Indoor : " + this.indoor);
        System.out.println("-----------------------------------");
    }
} // Cat Ends



class Bird extends Animal
{
    double wingspan;
    boolean canFly;

    Bird()
    {
        super();
        System.out.println("Called Default Constructor of Bird");
        this.wingspan = 0.5;
        this.canFly = true;
    }

    Bird(String a1, String a2, int a3, double a4, boolean a5)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Bird");
        this.wingspan = a4;
        this.canFly = a5;
    }

    void display()
    {
        super.display();
        System.out.println("Wingspan : " + this.wingspan + " meters");
        System.out.println("Can Fly  : " + this.canFly);
        System.out.println("-----------------------------------");
    }
} // Bird Ends



class TestAnimal
{
    public static void main(String[] args)
    {
        Dog D1 = new Dog();
        D1.display();

        Cat C1 = new Cat("Kitty", "Mammal", 2, "Black", true);
        C1.display();

        Bird B1 = new Bird("Parrot", "Bird", 1, 0.7, true);
        B1.display();
    }
} // TestAnimal Ends
