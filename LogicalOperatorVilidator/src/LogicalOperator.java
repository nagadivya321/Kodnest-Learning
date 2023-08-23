import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner scan = null;
		Scanner scan1=new Scanner(System.in);
		System.out.println("is input valid (true/false):"); 
		boolean a=scan1.nextBoolean();
		isValidInput(a);
	} 
	public static void isValidInput(boolean a) {
		System.out.println("Does input meet a certain condition (true/false):");
		Scanner scan3 = null;
		boolean b=scan3.nextBoolean();
		System.out.println("input is valid");
		
	}

}
