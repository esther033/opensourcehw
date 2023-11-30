package java_ex100;
import java.util.Scanner;
public class ex100_42 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if((n>=50&&n<=70)||(n%6==0))
		{
			System.out.print("win");
		}	else {
			System.out.print("lose");
		}
		scan.close();
		
	}

}