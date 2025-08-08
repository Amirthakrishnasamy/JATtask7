package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filenotfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename= "Test.txt";
		try {
			File file=new File(filename);
			Scanner sc=new Scanner(file);
			while (sc.hasNext()){
				String line=sc.nextLine();
				System.out.println(line);
				
			}
			sc.close();
			
		}
		catch(FileNotFoundException fil){
			System.out.println("The file called " +filename+ " is not found");
		}

	}

}
