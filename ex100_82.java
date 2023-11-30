package java_ex100;
import java.util.Scanner;
public class ex100_82 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i,j;
		for(i=a; i<=b; i++)
		{
			for(j=1; j<=9; j++)
			{
				System.out.printf("%d*%d=%d\n", i,j,i*j);
			}
		}
		
		scan.close();
	}

}
