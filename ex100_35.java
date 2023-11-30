package java_ex100;
import java.util.Scanner;
public class ex100_35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;	
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				
				sum+=i;
			}
		}
		
		System.out.println(sum);
		scan.close();
	}

}
