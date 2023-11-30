package java_ex100;
import java.util.Scanner;
public class ex100_60 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 터널의 높이 입력 받기
        int heightA = scan.nextInt();
        int heightB = scan.nextInt();
        int heightC = scan.nextInt();

        // 차의 높이
        int carHeight = 170;

        // 터널 통과 여부 확인
        if (heightA <= carHeight) {
            System.out.println("PASS");
        } else if (heightB <= carHeight) {
            System.out.println("CRASH " + heightB);
        } else if (heightC <= carHeight) {
            System.out.println("CRASH " + heightC);
        } else {
            System.out.println("PASS");
        }
        scan.close();
    }
}
