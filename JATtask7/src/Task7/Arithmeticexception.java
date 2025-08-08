package Task7;

import java.util.Scanner;

public class Arithmeticexception {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number 1 for division:");
		int num1=num.nextInt();
		System.out.println("Enter the number 2 for division:");
		int num2=num.nextInt();
		try {
		int c=num1/num2;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide the no");
		}
		

	}

}
