package section1;

public class Notebook extends Computer {
	public double screenSize;
	public double weight;

	public Notebook(String man, String proc, int ram, int disk, double procSpeed, double screen, double w) {
		super(man, proc, ram, disk, procSpeed);
		screenSize = screen;
		weight = w;
	}
	
	public String toString() {
		String result = super.toString() + 
						"\nScreen Size: " + screenSize + "inches" + 
						"\nWeight: " + weight + "kg";
		return result;
	}

	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "15", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computePower());
		System.out.println(test.toString());		// 자바에서는 항상 dynamic binding 
	}
}
