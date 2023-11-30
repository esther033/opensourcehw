package java_ex100;
import java.util.Scanner;
public class ex100_70 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		System.out.printf("%f\n", a*Math.pow(r, n-1));
		scan.close();
	}

}
