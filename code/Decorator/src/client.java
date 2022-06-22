import java.util.Scanner;
public class client {
	public static void main(String args[]) {
		getcurrentStock s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice: 1.indoor \n2.outdoor\n");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch==1) {
			System.out.println("enter choice: 1.GamesOnTable \n2.BoardGames\n3.CourtGames\n");
			int h = Integer.parseInt(sc.nextLine());
			if(h==1) {
				s = new GamesOnTable();
			}
			else if(h==2) {
				s = new BoardGames();
			}
			else {
				s = new CourtGames();
			}
		}
		else {
			System.out.println("enter choice: 1.AdventureGames \n2.StadiumGames \n3.Athletics\n");
			int h = Integer.parseInt(sc.nextLine());
			if(h==1) {
				s = new AdventureGames();
			}
			else if(h==2) {
				s = new StadiumGames();
			}
			else {
				s = new Athletics();
			}
		}
		s.stock();
	}
}
