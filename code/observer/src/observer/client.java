package observer;
import java.util.*;
public class client {
	public static void main(String []ar) {
		Store s = new Store();
		new FestivalDiscount1(s);
		new FestivalDiscount2(s);
		System.out.println("Setting the discount value to 10");
		s.setState(10);
	}
}
