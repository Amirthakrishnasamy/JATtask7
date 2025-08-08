package Task7;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}

public class CustomException {

public static void main(String[] args) {
		try {
			vote(0);
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
	}
		public static void vote(int age)throws InvalidAgeException {
		
				if (age<18) {
					throw new InvalidAgeException("Not eligible for voting");
				}
				else {
					System.out.println("Eligible for voting");
				}
		}
}
