package observer;
import java.util.*;
public class Store {
	ArrayList<Discount> discounts = new ArrayList<Discount>();
	Scanner s = new Scanner(System.in);
	private double discount;
	public void attach(Discount d) {
		discounts.add(d);
	}
	public void detach() {
		System.out.println("Enter Discount to be removed\n");
		int ch = Integer.parseInt(s.nextLine());
		discounts.remove(ch-1);
	}
	public void notify_() {
		for(Discount i:discounts) {
			i.update();
		}
	}
	public void setState(double discount) {
		this.discount = discount;
		notify_();
	}
	public double getState(){
		return this.discount;
	}
}
