package Encapsulation;

class Emp
{
	private int salary = 98000;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class Encap_Int 
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		e1.setSalary(130000);
		System.out.println("Salary is " + e1.getSalary());
	}
}
