

public class Client {
	static Customer c;
	
	Client(){
		c = new Customer();
		c.ChooseType();
	}
	
	public static void main(String []Args){
		Client cl = new Client();
		
		c = new SeniorCitizen();
		c.DisplayBill();
		
		c = new Regular();
		c.DisplayBill();
		
		c = new FirstTime();
		c.DisplayBill();
		
	}
}
