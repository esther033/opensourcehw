package java_ex100;
import java.util.Scanner;
public class ex100_20 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int sum = num1+num2+num3;
		System.out.printf("%d\n", sum);
		System.out.printf("%.1f", (float)sum/3);
		scan.close();
	}

}
