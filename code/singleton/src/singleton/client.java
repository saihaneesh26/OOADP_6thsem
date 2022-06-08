package singleton;
import java.util.*;
public class client {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Tab t = Tab.getInstance();
		while(true) {
			System.out.println("Enter choice:\n1.Visit url\n2.Display history\n3.exit");
			int i = Integer.parseInt(s.nextLine());
			if (i==1) {
				System.out.println("Enter url:");
				String url = s.nextLine();
				t.visit(url);
			}
			else if(i==2) {
				t.display();
			}
			else {
				break;
			}
		}
		
	}

}
