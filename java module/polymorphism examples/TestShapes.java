package polymorphism;



class Shape
{
    String color;
    double area;

    Shape()
    {
        System.out.println("Called Default Constructor of Shape");
        this.color = "Red";
        this.area = 0.0;
    }

    Shape(String a1, double a2)
    {
        System.out.println("Called Parameterized Constructor of Shape");
        this.color = a1;
        this.area = a2;
    }

    void display()
    {
        System.out.println("Color : " + this.color);
        System.out.println("Area  : " + this.area);
        System.out.println("CalArea="+CalArea());
    }
    double CalArea() {
    	return area;
    }
} // Shape Ends


class Circle extends Shape
{
    double radius;

    Circle()
    {
        super();
        System.out.println("Called Default Constructor of Circle");
        this.radius = 5.0;
    }

    Circle(String a1, double a2, double a3)
    {
        super(a1, a2);
        System.out.println("Called Parameterized Constructor of Circle");
        this.radius = a3;
    }

    void display()
    {
        super.display();
        System.out.println("Radius : " + this.radius);
        System.out.println("CalArea="+CalArea());
     
    }
    double CalArea() {
    	return 3.14*radius*radius;
    }
} // Circle Ends


class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle()
    {
        super();
        System.out.println("Called Default Constructor of Rectangle");
        this.length = 10.0;
        this.breadth = 5.0;
    }

    Rectangle(String a1, double a2, double a3, double a4)
    {
        super(a1, a2);
        System.out.println("Called Parameterized Constructor of Rectangle");
        this.length = a3;
        this.breadth = a4;
    }

    void display()
    {
        super.display();
        System.out.println("Length  : " + this.length);
        System.out.println("Breadth : " + this.breadth);
        System.out.println("CalArea="+CalArea());
       
    }
    double CalArea() {
    	return length*breadth;
    }
} // Rectangle Ends


class Triangle extends Shape
{
    double base;
    double height;

    Triangle()
    {
        super();
        System.out.println("Called Default Constructor of Triangle");
        this.base = 6.0;
        this.height = 4.0;
    }

    Triangle(String a1, double a2, double a3, double a4)
    {
        super(a1, a2);
        System.out.println("Called Parameterized Constructor of Triangle");
        this.base = a3;
        this.height = a4;
    }

    void display()
    {
        super.display();
        System.out.println("Base   : " + this.base);
        System.out.println("Height : " + this.height);
        System.out.println("CalArea="+CalArea());
       
    }
    double CalArea() {
    	return 1/2*(base*height);
    }
} // Triangle Ends


class TestShapes
{
    public static void main(String[] args)
    {   Shape C1;
        C1 = new Circle();
        C1.display();

        C1 = new Rectangle("Blue", 50.0, 10.0, 5.0);
        C1.display();

        C1 = new Triangle("Green", 25.0, 6.0, 4.0);
        C1.display();
    }
} // TestShape Ends
