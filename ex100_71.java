package java_ex100;
import java.util.Scanner;
public class ex100_71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		for(int i=0; i<num; i++)
		{
			int a = scan.nextInt();
			sum+=a;
		}
		System.out.printf("%d", sum);
		scan.close();
	}

}
