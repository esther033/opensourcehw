package java_ex100;
import java.util.Scanner;
public class ex100_90 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] attendanceNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            attendanceNumbers[i] = scanner.nextInt();
        }

        reverseAndPrint(attendanceNumbers);

        scanner.close();

	}
	  private static void reverseAndPrint(int[] numbers) {
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	    }
}
