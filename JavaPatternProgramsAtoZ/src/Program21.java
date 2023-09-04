import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0 || j==n|| i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		
		}
			System.out.println();
		}
	}

}
