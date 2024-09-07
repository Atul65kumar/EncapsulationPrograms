package Encapsulation;
class Amazon_Program
{
	private String username = "contact@grotechminds";
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}	
}
public class Program1 {
	public static void main(String[] args) 
	{
		Amazon_Program a1 = new Amazon_Program();
		a1.setUsername("atul@gmail.com");
		System.out.println(a1.getUsername());
	}
}
