
import java.util.Scanner;
public class Customer {
	static DiscountSlab d;
	
	void ChooseType(){
		System.out.println("Enter Discount Type - 1)30% 2)25% 3)20% 4)15%");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.nextLine();
		
		if(ch == 1){
			d = new Type1();
		}
		else if(ch == 2){
			d = new Type2();
		}
		else if(ch == 3){
			d = new Type3();
		}
		else if(ch == 4){
			d = new Type4();
		}
		else{
			System.out.println("Wrong Discount Type!!");
		}
		sc.close();
	}

	void DisplayBill()
	{
		
	}
}
