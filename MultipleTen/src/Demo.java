import java.util.Scanner;

public class Demo {
	public static void  checkMultipleOfTen(int n) {
		if (n%10==0) {
			System.out.println("The number is multiple of 10");
		}
		else
		{
			System.out.println("false");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		checkMultipleOfTen(n);
		
	}

}
