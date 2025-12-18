package Model;

public abstract class Employee {
	int id;
	String name;
	double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public abstract double calculateSalary(); 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID:"+this.id +"\nName: "
				+this.name+"\nSalary"+
				this.salary;
	}
	
}
