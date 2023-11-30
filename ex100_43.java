package java_ex100;
import java.util.Scanner;
public class ex100_43 {

    private static final String[] KOREAN_DIGIT = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    private static final String[] UNIT_POSITION = {"", "십", "백", "천", "만"};

    public static String numberString(int number) {
        if (number == 0) {
            return "영";
        }

        StringBuilder result = new StringBuilder();
        int position = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit > 0) {
                result.insert(0, UNIT_POSITION[position]);
                result.insert(0, KOREAN_DIGIT[digit]);
            }

            number /= 10;
            position = (position + 1) % 5;
        }

        return result.toString();
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(numberString(n));
		scan.close();
		
	}

}