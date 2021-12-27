// 파일 읽고 이름 순 정렬 - compareTo
package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	static int PERSON = 1000;
	static String[] name = new String[PERSON];
	static String[] number = new String[PERSON];
	static int n = 0;
	
	public static void main(String[] args) {

		try {
			String fileName = "input.txt";
			Scanner inFile = new Scanner(new File(fileName));
			
			while (inFile.hasNext()) {		// detect EOF
				name[n] = inFile.next();
				number[n] = inFile.next();
				++n;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(9);
		}
		
		bubbleSort();
		
		for (int i = 0; i < n; ++i) {
			System.out.println(name[i] + ": " + number[i]);
		}
		
	}

	// .compareToIgnoreCase() : 대소문자 구분없이 비교
	static void bubbleSort() {
		for (int i = n - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (name[j].compareTo(name[j + 1]) > 0) {
					String tmp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp;
					
					tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
				}
			}
		}
	}
}
