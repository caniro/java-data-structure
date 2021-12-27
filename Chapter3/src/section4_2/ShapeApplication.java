package section4_2;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeApplication {
	
	private int capacity = 10;
	private Shape[] shapes = new Shape[capacity];
	private int n = 0;
	private Scanner kb = new Scanner(System.in);
	
	public void processCommand() {
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			
			if (command.equals("add")) {
				handleAdd();
			} else if (command.equals("show") || command.equals("showdetail")) {
				handleShow(command.equals("showdetail"));
			} else if (command.equals("sort")) {
//				bubbleSort();
//				bubbleSort(shapes, n);
//				MyUtilities.bubbleSort(shapes, n);
				Arrays.sort(shapes, 0, n);		// generic method
			} else if (command.equals("exit")) {
				break;
			}
		}
	}
	
//	private void bubbleSort() {
//		for (int i = n - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (shapes[j].computeArea() > shapes[j + 1].computeArea()) {
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j + 1];
//					shapes[j + 1] = tmp;
//				}
//			}
//		}
//	}
//	
//	private void bubbleSort(MyComparable[] data, int size) {
//		for (int i = size - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (data[j].compareTo(data[j + 1]) > 0) {
//					MyComparable tmp = data[j];
//					data[j] = data[j + 1];
//					data[j + 1] = tmp;
//				}
//			}
//		}
//	}

	private void handleShow(boolean detailed) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + shapes[i].toString());
			if (detailed) {
				System.out.println("\tArea: " + shapes[i].computeArea());
				System.out.println("\tPerimeter: " + shapes[i].computePerimeter());
			}
		}
	}

	private void handleAdd() {
		String type = kb.next();

		switch(type) {
		case "R":
			int w = kb.nextInt();
			int h = kb.nextInt();
			addShape(new Rectangle(w, h));
			break;
		case "C":
			int r = kb.nextInt();
			addShape(new Circle(r));
			break;
		}
	}

	private void addShape(Shape s) {
		shapes[n] = s;
		++n;
	}

	public static void main(String[] args) {
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
	}
}
