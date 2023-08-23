import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount:");
		double purchase=scan.nextDouble();
		System.out.println("enter tax rate:");
		double taxrate=scan.nextDouble();
		calculateTotalWithTax(purchase,taxrate);
		
	}
	public static void calculateTotalWithTax(double purchase,double  taxrate) {
		double d=purchase*taxrate;
		System.out.println("total cost including tax:"+(d+purchase));
	}

}
