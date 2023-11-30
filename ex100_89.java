package java_ex100;
import java.util.Scanner;
public class ex100_89 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int k = scanner.nextInt();

	        if (k < 2 || k > 12) {
	            System.out.println("유효하지 않은 합입니다. 합은 2부터 12까지의 정수여야 합니다.");
	        } else {
	            printDiceCombinations(k);
	        }

	        scanner.close();
	}
	private static void printDiceCombinations(int k) {
        for (int i = 1; i <= 6; i++) {
            int j = k - i;
            if (j >= 1 && j <= 6) {
                System.out.println(i + " " + j);
            }
        }
    }
}
