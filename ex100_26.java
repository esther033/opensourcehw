package java_ex100;
import java.util.Scanner;

public class ex100_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("true or false를 입력하시오.");
		boolean input = scan.nextBoolean();
		boolean output = !input;
		System.out.println(output);
		scan.close();
	}

}
