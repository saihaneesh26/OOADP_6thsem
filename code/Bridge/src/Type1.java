
public class Type1 implements DiscountSlab{
	float rate = 0.3f;
	float discount;
	
	public void CalcDiscount(float r){
		discount = price * quantity * (rate +r);
		System.out.println("Price :$ "+price + " Quantity :$ "+quantity);
		System.out.println("Discount = $" + discount);
		float bill = price * quantity - discount;
		System.out.println("Bill = $"+ bill);
	}
}
