package Task7;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strlist=new ArrayList<>();
		strlist.add("Anusha");
		strlist.add("Vani");
		strlist.add("Keerthi");
		strlist.add("Bavya");
		
		String[] strarray=new String[strlist.size()];
		strarray=strlist.toArray(strarray);
		System.out.println("Array elements:");
        for (String s : strarray) {
            System.out.println(s);
        }

	}

}
