package java_ex100;
import java.util.Scanner;

public class ex100_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 당첨번호 6개와 보너스 번호 입력 받기
        int[] winningNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = scan.nextInt();
        }
        int bonusNumber = scan.nextInt();

        // 주희가 가진 로또 번호 입력 받기
        int[] userNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = scan.nextInt();
        }

        // 2등 여부 확인
        int matchingCount = countMatchingNumbers(winningNumbers, userNumbers);
        boolean hasBonusNumber = containsNumber(userNumbers, bonusNumber);

        // 결과 출력
        printResult(matchingCount, hasBonusNumber);
        scan.close();
    }

    // 배열에서 특정 숫자의 개수를 세는 메소드
    private static int countMatchingNumbers(int[] array1, int[] array2) {
        int count = 0;
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // 배열에서 특정 숫자가 포함되어 있는지 확인하는 메소드
    private static boolean containsNumber(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    // 결과 출력 메소드
    private static void printResult(int matchingCount, boolean hasBonusNumber) {
        if (matchingCount == 6) {
            System.out.println("1");
        } else if (matchingCount == 5 && hasBonusNumber) {
            System.out.println("2");
        } else if (matchingCount == 5) {
            System.out.println("3");
        } else if (matchingCount == 4) {
            System.out.println("4");
        } else if (matchingCount == 3) {
            System.out.println("5");
        } else {
            System.out.println("꽝");
        }
    }
}