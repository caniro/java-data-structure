package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {
	
	static MyRectangle2[] rects = new MyRectangle2[100];
	static int n = 0;
	
	
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new File("data.txt"));
			int x, y, w, h;
			while (inFile.hasNext()) {				
				x = inFile.nextInt();
				y = inFile.nextInt();
				w = inFile.nextInt();
				h = inFile.nextInt();
				
				rects[n] = new MyRectangle2(x, y, w, h);
				++n;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
		
		bubbleSort();
		
		for (int i = 0; i < n; i++) {
			System.out.println(rects[i].toString());
		}
	}

	private static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rects[j].calcArea() > rects[j + 1].calcArea()) {
					MyRectangle2 tmp = rects[j];
					rects[j] = rects[j + 1];
					rects[j + 1] = tmp;
				}
			}
		}
	}

}
