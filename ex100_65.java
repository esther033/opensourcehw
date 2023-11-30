package java_ex100;
import java.util.Scanner;
public class ex100_65 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(i%3==0)
			{
				System.out.printf("X ");
			}
			else {
				System.out.printf("%d ", i);
			}
			
		}
		scan.close();
	}

}
