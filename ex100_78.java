package java_ex100;
import java.util.Scanner;
public class ex100_78 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt(); // 초기값 설정

        // '='이 나올 때까지 계산
        while (true) {
            // 연산자 입력 받기
            char operator = scanner.next().charAt(0);

            // '='이 입력되면 종료
            if (operator == '=') {
                break;
            }

            // 수 입력 받기
            int operand = scanner.nextInt();

            // 계산 수행
            result = performOperation(result, operand, operator);
        }

        // 최종 결과 출력
        System.out.println(result);

        scanner.close();
    }
	
	
	  private static int performOperation(int result, int operand, char operator) {
	        switch (operator) {
	            case '+':
	                return result + operand;
	            case '-':
	                return result - operand;
	            case '*':
	                return result * operand;
	            case '/':
	                return result / operand;
	            default:
	                return 0;
	        }
	    }

}
