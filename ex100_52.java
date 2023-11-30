package java_ex100;
import java.util.Scanner;
public class ex100_52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if((n%10==2||n%10==3)&&(n!=12&&n!=13))
		{
			System.out.printf("%drd\n", n);
		}
		else {
			System.out.printf("%dst\n", n);
		}
		scan.close();
		
	}
		}

