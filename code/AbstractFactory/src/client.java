import java.util.*;
public class client {
	public static void main(String arsgs[]){
		abstractFactory af;
		Scanner s = new Scanner(System.in);
		System.out.println("enter gender:\n1.Male\n2.Female");
		int ch = Integer.parseInt(s.nextLine());		
		if(ch==1) {
			af = new Male();
			af.getPerson();
			af.getSport();
			af.display();
		}
		if(ch==2) {
			af = new Female();
			af.getPerson();
			af.getSport();
			af.display();
		}
		s.close();
	}
}
