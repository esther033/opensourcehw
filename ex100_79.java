package java_ex100;
import java.util.Scanner;
public class ex100_79 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 한 줄의 공백없는 문장 입력
        String sentence = scanner.nextLine();

        // 대문자를 소문자로, 소문자를 대문자로 변환
        String convertedSentence = convertCase(sentence);

        // 결과 출력
        System.out.println(convertedSentence);

        scanner.close();

	}
	private static String convertCase(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        return result.toString();
    }

}
