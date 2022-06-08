package singleton;

import java.util.*;

public class Tab {
	private Tab() {}
	private ArrayList<String> history = new ArrayList<String>();
	private static Tab a = new Tab();
	public static Tab getInstance() {
		return a;
	}
	public void visit(String url) {
		history.add(url);
	}
	public void display() {
		for(String i:history) {
			System.out.println("Visited :"+i.toString());
		}
	}
}
