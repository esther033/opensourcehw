package java_ex100;
import java.util.Scanner;
import java.util.Arrays;
public class ex100_97 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 학생 수(N)와 한 줄에 앉을 수 있는 자리수(C) 입력
        int N = scanner.nextInt();
        int C = scanner.nextInt();

        // 학생 키 배열 초기화
        int[] heights = new int[N];

        // 학생 키 입력
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // 키 순서대로 정렬
        Arrays.sort(heights);

        // 한 줄에 앉을 수 있는 자리수만큼 출력
        for (int i = 0; i < N; i++) {
            System.out.print(heights[i] + " ");

            // 한 줄에 앉을 수 있는 자리수(C)만큼 출력했으면 줄바꿈
            if ((i + 1) % C == 0) {
                System.out.println();
            }
        }

        scanner.close();

	}

}
