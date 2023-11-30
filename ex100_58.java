package java_ex100;
import java.util.Scanner;
public class ex100_58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		boolean valid = triangle(a, b, c);
		
		if(valid)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		scan.close();
	}



private static boolean triangle(int a, int b, int c)
{
	return (c<a+b)&&(a<b+c)&&(b<c+a);
}
}
