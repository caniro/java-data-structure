// 파일 읽기 - File
package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {

		int PERSON = 1000;
		String[] name = new String[PERSON];
		String[] number = new String[PERSON];
		int n = 0;
		
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
		
		for (int i = 0; i < n; ++i) {
			System.out.println(name[i] + ": " + number[i]);
		}
		
	}

}
