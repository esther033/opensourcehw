package java_ex100;
import java.util.Scanner;
public class ex100_86 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        if (n % 2 == 0 || n < 3 || n > 99) {
	            System.out.println("올바른 입력이 아닙니다. 홀수를 입력하세요.");
	        } else {
	            printTriangle(n);
	        }

	        scanner.close();
	    }

	    private static void printTriangle(int n) {
	        for (int i = 0; i < n; i += 2) {
	            int space = (n - i - 1) / 2;
	            int stars = i + 1;

	            for (int j = 0; j < space; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 0; j < stars; j++) {
	                System.out.print("*");
	            }

	            for (int j = 0; j < space; j++) {
	                System.out.print(" ");
	            }

	            System.out.println();
	        }
	    }

}
