package java_ex100;
import java.util.Scanner;
public class ex100_87 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("길이 n을 입력하세요 (n >= 3):");
	        int n = scanner.nextInt();

	        if (n < 3) {
	            System.out.println("올바른 입력이 아닙니다. n은 3 이상이어야 합니다.");
	        } else {
	            printSquare(n);
	        }

	        scanner.close();

	}

	private static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // 첫 번째와 마지막 행은 별표로 채워진다.
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                // 나머지 행은 첫 번째와 마지막 열만 별표로 채워진다.
                System.out.print("*");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
