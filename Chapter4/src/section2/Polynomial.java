package section2;

import section1.MySingleLinkedList;
import section1.Node;

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
		
		Node<Term> p = terms.head;
		Node<Term> prev = null;
		
		while (p != null && p.data.expo > expo) {
			prev = p;
			p = p.next;
		}
		
		if (p != null && p.data.expo == expo) {
			p.data.coef += coef;
			if (p.data.coef == 0) {
				if (prev == null)
					terms.removeFirst();
				else
					terms.removeAfter(prev);
			}
		} else {
			Term t = new Term(coef, expo);
			
			if (prev == null)
				terms.addFirst(t);
			else
				terms.addAfter(prev, t);
		}
	}

	public int calc(int x) {
		int result = 0;
		Node<Term> p = terms.head;
		
		while (p != null) {
			result += p.data.calc(x);
			p = p.next;
		}
		
		return result;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<Term> p = terms.head;
		
		sb.append(name + "(x) = ");
		while (p != null) {
			sb.append("+" + p.data.toString());
			p = p.next;
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		
	}
}
