package java_ex100;
import java.util.Scanner;
public class ex100_93 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // 7개의 단어 입력
	        String[] words = new String[7];
	        for (int i = 0; i < 7; i++) {
	            words[i] = scanner.next();
	        }

	        // 5초 대기
	        try {
	            Thread.sleep(5000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        // 화면 지우기
	        for (int i = 0; i < 50; ++i) System.out.println();

	        // k번째 단어 물어보기
	        System.out.print("몇 번째 단어는? ");
	        int k = scanner.nextInt();

	        // k번째 단어 출력
	        System.out.println(words[k - 1]);

	        scanner.close();

	}

}
