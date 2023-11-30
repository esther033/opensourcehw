package java_ex100;
import java.util.Scanner;
public class ex100_99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        int score = scanner.nextInt();

        // 함수 호출하여 학점 계산 및 출력
        calculateGrade(score);

        scanner.close();
	}
	 static void calculateGrade(int score) {
	        if (score >= 90) {
	            System.out.println("A학점");
	        } else if (score >= 80) {
	            System.out.println("B학점");
	        } else if (score >= 70) {
	            System.out.println("C학점");
	        } else if (score >= 60) {
	            System.out.println("D학점");
	        } else {
	            System.out.println("E학점");
	        }
	    }

}
