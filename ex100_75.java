package java_ex100;
import java.util.Scanner;
public class ex100_75 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(Isprime(n)==1)
		{
			System.out.printf("prime\n");
		}
		else {
			System.out.printf("not prime");
		}
		
		scan.close();
	}
private static int Isprime(int n)
{
	int count=0;
	for(int i=2; i<=n; i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	
	if(count==1)
	{
		return 1;
	}
	else {
		return 0;
	}
}
}

