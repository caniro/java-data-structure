// Å¬·¡½º
package section1;

public class Code01 {

	public static void main(String[] args) {
		Person1 first = new Person1();
		
		first.name = "John";
		first.number = "0102483120";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "456454565";
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	}
	
}
