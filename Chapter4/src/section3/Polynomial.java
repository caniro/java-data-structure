package section3;

import java.util.Iterator;

public class Polynomial {
	public char name;
	public MySingleLinkedList<Term> terms; 
	
	public Polynomial(char name) {
		this.name = name;
		terms = new MySingleLinkedList<>();
	}
	
	public void addTerm(int coef, int expo) {
		if (coef == 0)
			return ;
//		section4에서 제대로 처리
	}

	public int calc(int x) {
		int result = 0;		
		Iterator<Term> iter = terms.iterator();
		
		while (iter.hasNext()) {
			Term t = iter.next();
			result += t.calc(x);
		}
		
		return result;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Term> iter = terms.iterator();
		
		sb.append(name + "(x) = ");
		while (iter.hasNext()) {
			Term t = iter.next();
			sb.append("+" + t.toString());
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
	}
}
