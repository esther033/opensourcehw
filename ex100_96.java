package java_ex100;
import java.util.Scanner;
import java.util.*;
public class ex100_96 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        scanner.nextLine(); // 개행문자 처리

	        TreeMap<Integer, String> scoreMap = new TreeMap<>(Collections.reverseOrder());

	        for (int i = 0; i < n; i++) {
	            String name = scanner.nextLine();
	            int score = scanner.nextInt();
	            scanner.nextLine(); // 개행문자 처리
	            scoreMap.put(score, name);
	        }

	        int count = 0;
	        String thirdHighestName = "";

	        for (Map.Entry<Integer, String> entry : scoreMap.entrySet()) {
	            if (count == 2) {
	                thirdHighestName = entry.getValue();
	                break;
	            }
	            count++;
	        }

	        System.out.println(thirdHighestName);

	        scanner.close();

	}

}
