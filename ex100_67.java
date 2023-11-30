package java_ex100;
import java.util.Scanner;
public class ex100_67 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num!=0)
		{
			System.out.printf("%d\n", num);
			num--;
		}
		
		scan.close();

	}

}
