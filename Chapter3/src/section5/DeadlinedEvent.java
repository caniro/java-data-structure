package section5;

public class DeadlinedEvent extends Event {
	public MyDate deadline;
	
	public DeadlinedEvent(String title, MyDate date) {
		super(title);
		deadline = date;
	}

	public boolean isRelevant(MyDate date) {
		return deadline.compareTo(date) >= 0;
	}
	
	public MyDate getRepresentativeDate() {
		return deadline;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
}
