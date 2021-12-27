// Scanner ¿¹½Ã
import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {

		String name = null;
		int age;
		String gender = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type your name, age and gender: ");
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if (gender.equals("male")) {
			System.out.println(name + ", you are " + age + " years old man.");
		} else if (gender.equals("female")){
			System.out.println(name + ", you are " + age + " years old woman.");
		} else {
			System.out.println("Hmm... Interesting.");
		}
		
		kb.close();
	}

}
