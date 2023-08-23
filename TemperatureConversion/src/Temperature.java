import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("welcome to temperature conversion tool");
		System.out.println("choose type conversions \n 1.celsius to fahrenheit  \n 2. fahrenheit to celsius");
		int ch=scan.nextInt();
		switch(ch) {
		case 1: System.out.println("enter celsius to fahrenheit:");
		       double celsius =scan.nextDouble();
		       double fahrenheit=((celsius)*9/5)+32;
		       System.out.println(celsius+" cel is equalent to "+fahrenheit+"Fahrenheit");
		       break;
		case 2:
				System.out.println("enter fahrenheit to celsius:");
				double fahrenheit1=scan.nextDouble();
				double celsius1=((fahrenheit1-32)*5/9);
				System.out.println(fahrenheit1+ "fahr is equalent to "+celsius1);
		}
	}
}
		
