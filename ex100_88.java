package java_ex100;
import java.util.Scanner;
public class ex100_88 {

		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();

		        if (n > 50) {
		            System.out.println("n은 50 이하의 정수여야 합니다.");
		        } else {
		            int sum = calculateSeriesSum(n);
		            System.out.println(sum);
		        }

		        scanner.close();

	}
		  private static int calculateSeriesSum(int n) {
		        int sum = 0;

		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= i; j++) {
		                sum += j;
		            }
		        }

		        return sum;
		    }

}
