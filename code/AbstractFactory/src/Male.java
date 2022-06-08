import java.util.*;
public class Male extends abstractFactory {
	Sport s;
	Person p;
	Scanner sc = new Scanner(System.in);
	public void getSport() {
		System.out.println("enter sport:1.indoorRegular\n2.OutdoorRegular\n3.OutdoorAdventure");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch==1) {
		this.s = new IndoorRegular("Indoorregular");
		}
		if(ch==2) {
			this.s = new OutdoorRegular("OutdoorRegular");
		}
		if(ch==3) {
			this.s = new OutdoorAdventure("OutdoorAdventure");
		}
	}
	@Override
	public void getPerson() {
		System.out.println("enter Person:1.DifferentlyAbled\n2.Abled");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch==1) {
			this.p = new DifferntlyAbled("DifferentlyAbled");
		}
		if(ch==2) {
			this.p = new Abled("Abled");
		}
	}
	public void display() {
		System.out.println("Sport: "+s.name+"\nPerson: "+p.name);
	}
}
