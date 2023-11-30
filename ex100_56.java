package java_ex100;
import java.util.Scanner;
public class ex100_56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int count=0;
		if(status(a)==1)
		{
			count++;
		}
		
		if(status(b)==1)
		{
			count++;
		}
		 
		if(status(c)==1)
		{
			count++;
		}
		
		if(status(d)==1)
		{
			count++;
		}
		
		
		if(count==1)
		{
			System.out.println("도");
		}
		else if(count==2)
		{
			System.out.println("개");
		}
		else if(count==3)
		{
			System.out.println("걸");
		}
		else if(count==4)
		{
			System.out.println("윷");
		}
		
		else {
			System.out.println("모");
		}
		scan.close();
	}

	private static int status(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else {
			return 1;
		}
	}
}

