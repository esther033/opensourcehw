package java_ex100;
import java.util.Scanner;
public class ex100_61 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        // 첫 번째 정수 입력
        int num1 = scan.nextInt();

        // 연산자 입력
        String operator = scan.next();

        // 두 번째 정수 입력
        int num2 = scan.nextInt();

        // 결과 계산
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // 결과 출력
        if (operator.equals("/")) {
            System.out.printf("%.2f\n", result);
        } else {
            System.out.println((int) result);
        }
        scan.close();
	}

}
