import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
if(i==0&&j<=n/2|| j==0&&i<=n/2||i==n&&j<=n/2||j==n/2&&i<=5||i==j&&j>=3&&j<=7) {
		
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
