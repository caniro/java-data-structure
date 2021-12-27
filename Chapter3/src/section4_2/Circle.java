package section4_2;

public class Circle extends Shape {
	public int radius;
	
	public Circle(int r) {
		super("Circle");
		radius = r;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	public double computePerimeter() {
		return Math.PI * 2.0 * radius;
	}
	
	public String toString() {
		return "Circle: radius is " + radius;
	}
}
