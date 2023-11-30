package java_ex100;
import java.util.Scanner;
import java.util.Random;
public class ex100_100 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // 1에서 100 사이의 랜덤 숫자 생성
	        int randomNumber = random.nextInt(100) + 1;

	        int userGuess;

	        System.out.println("1에서 100까지의 숫자 맞추기 게임을 시작합니다.");

	        do {
	            System.out.print("숫자를 입력하세요: ");
	            userGuess = scanner.nextInt();

	            if (userGuess < randomNumber) {
	                System.out.println("더 큰 숫자를 입력하세요.");
	            } else if (userGuess > randomNumber) {
	                System.out.println("더 작은 숫자를 입력하세요.");
	            } else {
	                System.out.println("축하합니다! 정답입니다.");
	            }

	        } while (userGuess != randomNumber);

	        scanner.close();

	}

}
