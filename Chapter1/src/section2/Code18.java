// 메서드 정의 - bubbleSort, swap
package section2;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; ++i)
			data[i] = kb.nextInt();
		kb.close();

		bubbleSort(data);
		
		System.out.println("Sorted data: ");
		for (int i = 0; i < n; ++i)
			System.out.println(data[i]);
		
	}
	
	static void bubbleSort(int[] data) {
		for (int i = data.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (data[j] > data[j + 1]) {
					swap(data, j, j + 1);
				}
			}
		}
	}
	
	static void swap(int[] data, int i, int j) {  // java에서는 포인터 접근 못함
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

}
