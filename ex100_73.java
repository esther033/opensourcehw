package java_ex100;
import java.util.Scanner;
public class ex100_73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[]= {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};
		int k = scan.nextInt();
		int h = scan.nextInt();
		System.out.print(num[k-1]+num[h-1]);
		scan.close();
}
}