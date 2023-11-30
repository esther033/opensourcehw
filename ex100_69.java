package java_ex100;
import java.util.Scanner;
public class ex100_69 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		System.out.printf("%d\n", a+(n-1)*d);
		scan.close();
		}

}
