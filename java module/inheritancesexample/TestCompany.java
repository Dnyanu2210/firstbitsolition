package javademo;

class Employee
{
    int id;
    String name;
    double salary;

    Employee()
    {
        System.out.println("Called Default Constructor of Employee");
        this.id = 101;
        this.name = "Default Employee";
        this.salary = 20000.00;
    }

    Employee(int a1, String a2, double a3)
    {
        System.out.println("Called Parameterized Constructor of Employee");
        this.id = a1;
        this.name = a2;
        this.salary = a3;
    }

    void display()
    {
        System.out.println("ID     : " + this.id);
        System.out.println("Name   : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
} // Employee Ends



class Admin extends Employee
{
    double allowance;

    Admin()
    {
        super();
        System.out.println("Called Default Constructor of Admin");
        this.allowance = 2500.00;
    }

    Admin(int a1, String a2, double a3, double a4)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of Admin");
        this.allowance = a4;
    }

    void display()
    {
        super.display();
        System.out.println("Allowance : " + this.allowance);
        System.out.println("----------------------------------");
    }
} // Admin Ends



class HR extends Employee
{
    double incentive;

    HR()
    {
        super();
        System.out.println("Called Default Constructor of HR");
        this.incentive = 3500.00;
    }

    HR(int a1, String a2, double a3, double a4)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of HR");
        this.incentive = a4;
    }

    void display()
    {
        super.display();
        System.out.println("Incentive : " + this.incentive);
        System.out.println("----------------------------------");
    }
} // HR Ends



class SalesManager extends Employee
{
    double commission;

    SalesManager()
    {
        super();
        System.out.println("Called Default Constructor of SalesManager");
        this.commission = 4000.00;
    }

    SalesManager(int a1, String a2, double a3, double a4)
    {
        super(a1, a2, a3);
        System.out.println("Called Parameterized Constructor of SalesManager");
        this.commission = a4;
    }

    void display()
    {
        super.display();
        System.out.println("Commission : " + this.commission);
        System.out.println("----------------------------------");
    }
} // SalesManager Ends



class TestCompany
{
    public static void main(String[] args)
    {
        Admin A1 = new Admin();
        A1.display();

        HR H1 = new HR(501, "Priya Sharma", 42000.00, 3500.00);
        H1.display();

        SalesManager S1 = new SalesManager(601, "Amit Verma", 35000.00, 4500.00);
        S1.display();
    }
}
