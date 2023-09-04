import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==n || j==0) {
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
