package java_ex100;
import java.util.Scanner;
public class ex100_57 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum=0;
		sum = kcal(a,b);
		if(sum>500)
		{
			System.out.println("angry");
		}
		else {
			System.out.println("no angry");
		}
		
		scan.close();
		

	}

	private static int kcal(int a, int b)
	{
		int cheese = 400;
		int vage = 340;
		int milk = 170;
		int agg= 100;
		int salad = 70;
		int sum=0;
		if(a==1)
		{
			sum+=cheese;
		}
		else if(a==2)
		{
			sum+=vage;
		}
		else if(a==3)
		{
			sum+=milk;
		}
		else if(a==4) {
			sum+=agg;
		}
		else if(a==5)
		{
			sum+=salad;
		}
		
		if(b==1)
		{
			sum+=cheese;
		}
		else if(b==2)
		{
			sum+=vage;
		}
		else if(b==3)
		{
			sum+=milk;
		}
		else if(b==4) {
			sum+=agg;
		}
		else if(b==5)
		{
			sum+=salad;
		}
		return sum;
	}
}
