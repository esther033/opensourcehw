package java_ex100;
import java.util.Scanner;
public class ex100_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade = scan.next().charAt(0);
		switch(grade)
		{
		case 'A': 
		System.out.print("best!!!");
		break;
		case 'B':
		System.out.print("good!!");
		break;
		case 'C':
		System.out.print("run!");
		break;
		case 'D':
		System.out.print("slowly~");
		break;
		default:
			System.out.print("what?");
			
		scan.close();
		
		
		}
	}

}
