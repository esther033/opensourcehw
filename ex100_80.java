package java_ex100;
import java.util.Scanner;
public class ex100_80 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        // 암호문 입력
	        String cipherText = scanner.nextLine();

	        // 암호문을 평문으로 복원
	        String plainText = decryptCaesarCipher(cipherText);

	        // 결과 출력
	        System.out.println(plainText);

	        scanner.close();
		
	}

	 private static String decryptCaesarCipher(String cipherText) {
	        StringBuilder plainText = new StringBuilder();

	        for (char ch : cipherText.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                char decryptedChar = decryptChar(ch);
	                plainText.append(decryptedChar);
	            } else {
	                plainText.append(ch);
	            }
	        }

	        return plainText.toString();
	    }

	    // 알파벳 복호화 메소드
	    private static char decryptChar(char encryptedChar) {
	        int shift = 3; // 씨저 암호의 밀린 글자 수
	        char base = Character.isUpperCase(encryptedChar) ? 'A' : 'a';

	        int decryptedChar = (encryptedChar - base - shift + 26) % 26 + base;
	        return (char) decryptedChar;
	    }
}
