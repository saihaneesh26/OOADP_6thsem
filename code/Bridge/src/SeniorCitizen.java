

public class SeniorCitizen extends Customer{
	
	public void DisplayBill(){
		System.out.println("Senior Citizen Bill:");
		d.CalcDiscount(0.05f);
	}

}
