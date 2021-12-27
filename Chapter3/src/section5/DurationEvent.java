package section5;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}

	public boolean isRelevant(MyDate date) {
		return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
	}
	
	public MyDate getRepresentativeDate() {
		return begin;
	}
	
	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}
}
