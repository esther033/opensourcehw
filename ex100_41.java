package java_ex100;
import java.util.Scanner;
public class ex100_41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if((n>=30&&n<=40)||(n>=60&&n<=70))
		{
			System.out.print("win");
		}	else {
			System.out.print("lose");
		}
		scan.close();
		
	}

}