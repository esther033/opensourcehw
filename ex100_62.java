package java_ex100;
import java.util.Scanner;
public class ex100_62 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 학년, 반, 번호 입력 받기
	        int grade = scanner.nextInt();
	        int classNumber = scanner.nextInt();
	        int studentNumber = scanner.nextInt();

	        // 학번 출력
	        System.out.printf("%d%02d%03d\n", grade, classNumber, studentNumber);
	        scanner.close();
	    }
	}


