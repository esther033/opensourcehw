package java_ex100;
import java.util.Scanner;
public class ex100_48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birth = scan.nextInt();
		int sex = scan.nextInt();
		if(sex==1||sex==2)
		{
			birth=1900+birth/10000;
		}
		if(sex==3||sex==4)
		{
			birth=2000+birth/10000;
		}
		
		int currentYear = 2018;
		int age = currentYear - birth +1 -6;
		System.out.printf("%d", age);
		scan.close();
		
	}
		}

