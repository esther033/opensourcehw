package java_ex100;
import java.util.Scanner;
public class ex100_49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int minute = scan.nextInt();
		if(minute<30)
		{
			time--;
			minute=60-30+minute;
		}
		
		else {
			minute=minute-30;
		}
		
		System.out.printf("%d %d\n", time, minute);
		
		scan.close();
		
	}
		}

