package section3;

public class Term {
	public int coef;
	public int expo;
	
	public Term(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int calc(int x) {
		return (int)(coef * Math.pow(x, expo));
	}
	
	public String toString() {
		return coef + "x^" + expo;
	}
}
