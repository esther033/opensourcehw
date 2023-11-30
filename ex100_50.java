package java_ex100;
import java.util.Scanner;
public class ex100_50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int BMI = scan.nextInt();
		if(BMI<18.5)
		{
			System.out.println("저체중");
		}
		if(BMI>=18.5&&BMI<=23)
		{
			System.out.println("정상체중");
		}
		if(BMI>23)
		{
			System.out.println("과체중");
		}
		
		
		scan.close();
		
	}
		}

