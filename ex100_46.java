package java_ex100;
import java.util.Scanner;
public class ex100_46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>170)
		{
			System.out.printf("PASS\n");
		} else {
			System.out.printf("CRASH\n");
		}
		
		
		if(b>170)
		{
			System.out.printf("PASS\n");
		} else {
			System.out.printf("CRASH\n");
		}
		
		if(c>170)
		{
			System.out.printf("PASS\n");
		} else {
			System.out.printf("CRASH\n");
		}
		scan.close();
		
	}
		}

