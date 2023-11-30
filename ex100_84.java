package java_ex100;
import java.util.Scanner;
public class ex100_84 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		for(i=n-1; i>0; i--)
		{
			for(j=i; j>0; j--)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
