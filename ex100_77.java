package java_ex100;
import java.util.Scanner;
public class ex100_77 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = fact(n);
		System.out.printf("%d", result);
		scan.close();
	}

	private static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		} else {
			return n*fact(n-1);
		}
		
	}
}
