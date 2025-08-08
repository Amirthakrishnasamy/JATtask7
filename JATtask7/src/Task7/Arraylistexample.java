package Task7;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("Asha");
		list.add("Anisha");
		list.add("Anant");
		list.add("Barath");
		list.add("Bharathy");
		list.add("Nisha");
		list.add("Soumya");
		
		System.out.println("Printing the list:"+list);
		System.out.println("Is the arraylist is empty:"+list.isEmpty());
		list.clear();
		System.out.println("Is the arraylist is empty:"+list.isEmpty());

	}

}
