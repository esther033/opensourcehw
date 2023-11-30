package java_ex100;
import java.util.Scanner;
public class ex100_54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b%a==0)
		{
			System.out.printf("%d*%d=%d\n", a, b/a, b);
		}
		
		else if(a%b==0)
		{
			System.out.printf("%d*%d=%d\\n", b, a/b, a);
		}
		
		else {
			System.out.printf("none\n");
		}
		scan.close();
	}

}
