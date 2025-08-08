package Task7;

public class Arrayexceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]= {1,34,53,34,56};
			System.out.println("Printing the final value:"+a[5]);
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Please Enter the valid index number");
		}
        try {
        	String str="Hello World";
        	System.out.println(str.charAt(12));
        }
        catch(StringIndexOutOfBoundsException soe) {
        	System.out.println("Enter the correct character value");
        }
	}

}
