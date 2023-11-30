package java_ex100;

import java.util.Scanner;

public class ex100_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = compare(a,b);
		System.out.println(result);
		scan.close();
	}

	private static int compare(int a, int b)
	{
		if(a==b)
			return 0;
		else
			return 1;
	}

}
