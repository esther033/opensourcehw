package java_ex100;
import java.util.Scanner;
public class ex100_39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.printf("%d", a);
			} else {
				System.out.printf("%d", c);
			}
			
		}
		
		if(a<b)
		{
			if(b>c)
			{
				System.out.printf("%d", b);
			}	else {
				System.out.printf("%d", c);
			}
			
		}
		
		
		scan.close();
		
	}
}