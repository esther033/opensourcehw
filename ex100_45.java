package java_ex100;
import java.util.Scanner;
public class ex100_45 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
		double x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
		if(x1==x2)
		{
			System.out.printf("방적식의 해는 %.2f", x1);
		} 
		else if(x1!=x2)
		{
			System.out.printf("방적식의 해는 %.2f\n", x1);
			System.out.printf("방적식의 해는 %.2f", x2);
		}
		else {
			System.out.println("실근이 없습니다. ");
		}
		
		scan.close();
		
	}

}