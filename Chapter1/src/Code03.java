// 문자열 비교 - .equals()
import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		input = kb.next();
		if (str.equals(input)) {
			System.out.println("Strings match!");
		} else {
			System.out.println("Strings do NOT match!");
		}
		
		kb.close();
	}

}
