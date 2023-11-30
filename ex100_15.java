package java_ex100;
import java.util.Scanner;
public class ex100_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		System.out.println(String.format("%04d", year)+"."+String.format("%02d", month)+"."
		+String.format("%02d", day));
		scan.close();
		
	}

}
