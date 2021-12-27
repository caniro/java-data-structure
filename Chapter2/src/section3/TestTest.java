package section3;

public class TestTest {
	public static void main(String[] args) {
		Test test1 = new Test();
		
		test1.t = 10;
		Test.s = 100;
		test1.print2();
		
		Test test2 = new Test();
		Test.print1();
		test2.print2();
	}
}
