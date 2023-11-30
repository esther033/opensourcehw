package java_ex100;
import java.util.Scanner;
public class ex100_98 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 바둑판의 크기
	        int[][] board = new int[10][10];

	        // 흰돌의 개수 입력
	        int n = scanner.nextInt();

	        // 흰돌의 좌표 입력 및 바둑판에 표시
	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	            board[x][y] = 1;
	        }

	        // 바둑판 출력
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }

	}


