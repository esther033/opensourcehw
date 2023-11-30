package java_ex100;
import java.util.Scanner;
public class ex100_40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float height = scan.nextFloat();
		if(height>=50&&height<=60)
		{
			System.out.print("win");
		}	else {
			System.out.print("lose");
		}
		scan.close();
		
	}

}