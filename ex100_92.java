package java_ex100;
import java.util.Scanner;
public class ex100_92 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 10개의 숫자 입력
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 5초 대기
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 화면 지우기
        for (int i = 0; i < 50; ++i) System.out.println();

        // k번째 숫자 물어보기
        System.out.print("몇 번째 숫자는? ");
        int k = scanner.nextInt();

        // k번째 숫자 출력
        System.out.println(numbers[k - 1]);

        scanner.close();
    }


}
