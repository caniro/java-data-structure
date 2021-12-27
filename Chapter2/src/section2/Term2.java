package section2;

public class Term2 {
	public int coef;
	public int exp;
	
	public int calcTerm(int x) {
		return (int)(coef * Math.pow(x, exp));
	}

	public void printTerm() {
		System.out.print(coef + "x^" + exp);
	}

}
