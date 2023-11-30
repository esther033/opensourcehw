package java_ex100;
import java.util.Scanner;
public class ex100_53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double sum=0;
		double sub1=0;
		double sub2=0;
		double mul=0;
		double div1;
		double div2=0;
		sum=a+b;
		sub1=a-b;
		sub2=b-a;
		mul=a*b;
		div1=a/b;
		div2=b/a;
		
		double max = findmax(sum, sub1, sub2, mul, div1, div2);
		System.out.printf("%f\n", max);
		scan.close();
	}

private static double findmax(double ...number)
{
	double max= number[0];
	for(double num : number)
	{
		if(num>max)
		{
			max=num;
		}
	}
	
	return max;
}
	
		}


