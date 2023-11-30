package java_ex100;
import java.util.Scanner;
public class ex100_36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int i, j;

		for(i=1; i<=n; i++)

		{

		for(j=1; j<=m; j++)

		{

		System.out.printf("%d %d\n", i, j);

		}

		}
		scan.close();
		
	}

}
