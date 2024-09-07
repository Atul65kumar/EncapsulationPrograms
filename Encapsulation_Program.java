package Encapsulation;
class Amazon_Auth
{
	private int otp = 012345;

	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
}
public class Encapsulation_Program 
{
	public static void main(String[] args) 
	{
		Amazon_Auth a1 = new Amazon_Auth();
		a1.setOtp(98765);
		System.out.println(a1.getOtp());	
	}
}
