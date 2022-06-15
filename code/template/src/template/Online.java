package template;
import java.util.*;

public class Online extends Order {
	Scanner s = new Scanner(System.in);
	int ch;
	@Override
	protected void selectItem() {
		System.out.println("Online : Select Items\n1.Item 1 : 100 Rs\n2.Item 2: 200 Rs");
		ch = s.nextInt();
	}

	@Override
	protected void doPayment() {
		int val;
		if(ch==1) {
			val = 100;
		}
		else {
			val  = 200;
		}
		System.out.println("Online : Do payment of "+val+"\nOptions:\n1.Netbanking");
	}

	@Override
	protected void doDelivery() {
		System.out.println("Online Delivery: Pay for shipping and provide Delivery address.");
	}

}
