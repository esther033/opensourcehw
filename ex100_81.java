package java_ex100;
import java.util.Scanner;
public class ex100_81 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		System.out.println(findmax(a,b,c,d,e));
		System.out.println(findmin(a,b,c,d,e));
		
		scan.close();
		

	}

	private static int findmax(int ...num)
	{
		int max = num[0];
		for(int n : num)
		{
			if(n>max)
			{
				max=n;
			}
		}
		return max;
	}
	
	private static int findmin(int ...num)
	{
		int min = num[0];
		for(int n : num)
		{
			if(n<min)
			{
				min=n;
			}
		}
		return min;
	}
}
