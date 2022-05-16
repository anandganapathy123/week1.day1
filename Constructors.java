package day1;

public class Constructors {

	public void makeCalls()
	{
		System.out.println("this method to makecalls");
	}
	
	public void sendMsgs()
	{
		System.out.println("this method to sendMsgs");
	}
	
	
	public static void main(String[] args) {
		
		
		Constructors con = new Constructors();
		con.makeCalls();
		con.sendMsgs();
		
	}
	
}
