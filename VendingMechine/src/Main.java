import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P00":
			System.out.println("pepsi");
			break;
		case "P01" :
			System.out.println("coco cola");
			break;
		case "P02":
			System.out.println("Fanta");
			break;
		case "P03":
			System.out.println("jal jeera");
			break;
		case "P04":
			System.out.println("mountain");
			break;
		default:
			System.out.println("in valid");
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any P00,P01,P02,P03,P04");
		String productCode=scan.next();
		getProduct(productCode);
		
	}

}
