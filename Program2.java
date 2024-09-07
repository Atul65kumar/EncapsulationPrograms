package Encapsulation;
class Amazon
{
	private String username = "contact@grotechminds";
	private String password = "asaaererfdfd112";
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}	
}
public class Program2 {

	public static void main(String[] args) 
	{
		Amazon a1 = new Amazon();
		a1.setUsername("atul@gmail.com");
		System.out.println("New User name is -- " + a1.getUsername());
		a1.setPassword("Atul@gtm65");
		System.out.println("New Password is -- " + a1.getPassword());
	}
}
