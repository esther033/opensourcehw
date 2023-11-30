package java_ex100;
import java.util.Scanner;
public class ex100_83 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i,j;
		for(i=0; i<n-1; i++)
		{
			for(j=0; j<i+1; j++)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
