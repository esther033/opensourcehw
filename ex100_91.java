package java_ex100;
import java.util.Scanner;
public class ex100_91 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // 숫자의 개수 입력
	        int n = scanner.nextInt();

	        // n개의 정수 입력
	        int[] numbers = new int[n];
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // 왼쪽으로 로테이션하여 출력
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n + i; j++) {
	                System.out.print(numbers[j % n] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();

	}

}
