package section3;

public class Test { // subclass of Object
	public int a;
	public double x;

	@Override
	public String toString() {
		return a + " " + x;
	}

////@Override		// 오버라이드가 아님 (매개변수가 Object가 아니므로) -> 오버로딩임
//	public boolean equals(Test other) {
//		return a == other.a && x == other.x;
//	}

	@Override
	public boolean equals(Object other) {
		Test other2 = (Test) other; // type casting
		return a == other2.a && x == other2.x;
	}

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();

//		test2.a = 5;
//		test2.x = 1.29384792;

		System.out.println(test1.toString());
		if (test2.equals(test1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		Object[] array = new Object[100];
		int a = 20;
////		Integer age = new Integer(a);	// wrapping
//		Integer age = a;				// wrapping
//		array[0] = age;
		array[0] = a;					// auto boxing
		
//		int b = age.intValue();			// unwrapping
		int b = (Integer)array[0];		// auto unboxing
		System.out.println(b);
		
		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(c);
	}
}
