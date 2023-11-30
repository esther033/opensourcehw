package java_ex100;
import java.util.Scanner;
public class ex100_30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>0)
		{
			System.out.println("plus");
		} else if(num==0) {
			System.out.println("zero");
		} else if(num<0) {
			System.out.println("minus");
		}
		
		if(num%2==0)
		{
			System.out.println("even");
		} else{
			System.out.println("odd");
		}
		scan.close();
	}

}
