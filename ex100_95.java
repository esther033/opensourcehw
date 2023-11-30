package java_ex100;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ex100_95 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        String input = scanner.nextLine().toLowerCase(); // 소문자로 변환
	        Map<Character, Integer> countMap = new HashMap<>();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
	            }
	        }

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.println(ch + ":" + countMap.getOrDefault(ch, 0));
	        }

	        scanner.close();

	}

}
