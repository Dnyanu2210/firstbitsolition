package polymorphism;



class Employee
{
    int id;
    String name;
    double salary;

    int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

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
        System.out.println("Calsalary is"+CalSalary());
    }
    
    double CalSalary() {
    	return salary;
    }
} // Employee Ends



class Admin extends Employee
{
    double allowance;

    double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

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
        System.out.println("Calsalary is"+CalSalary());
        System.out.println("----------------------------------");
    }
    double CalSalary() {
    	return salary+allowance;
    }
} // Admin Ends



class HR extends Employee
{
    double incentive;

    double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

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
        System.out.println("Calsalary is"+CalSalary());
        System.out.println("----------------------------------");
    }
    double CalSalary() {
    	return salary+incentive;
    }
} // HR Ends



class SalesManager extends Employee
{
    double commission;

    double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

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
        System.out.println("Calsalary is"+CalSalary());
        
    }
    double CalSalary() {
    	return salary+commission;
    }
} // SalesManager Ends



class TestEmployeeCalsalary
{
    public static void main(String[] args)
    {
    	
    	Employee e1;
    	e1=new Employee(110,"Dnyanu",20000);
    	
        e1 = new Admin();
        e1.display();

        e1 = new HR(501, "Priya Sharma", 42000.00, 3500.00);
       e1.display();

       e1 = new SalesManager(601, "Amit Verma", 35000.00, 4500.00);
        e1.display();
        
        
    }
}

