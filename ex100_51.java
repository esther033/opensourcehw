package java_ex100;
import java.util.Scanner;
public class ex100_51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n<=50)
		{
			System.out.printf("%d\n", n);
			System.out.println("GOOD");
		}
		if(n>50)
			
		{	
			int swapn = (n%10)*10+(n/10);
			swapn = swapn*2;
			System.out.printf("%d\n", swapn);
			System.out.println("OH MY GOD");
			
		}
		
		scan.close();
		
	}
		}

