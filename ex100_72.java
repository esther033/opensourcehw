package java_ex100;
import java.util.Scanner;
public class ex100_72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max= Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			int num = scan.nextInt();
			if(num>max)
			{
				max=num;
			}
			
		}
		System.out.printf("%d\n", max);
		scan.close();
	
		
		
	}
	}
	
	