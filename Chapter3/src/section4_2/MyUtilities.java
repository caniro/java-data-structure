package section4_2;

public class MyUtilities {
//	public static void bubbleSort(MyComparable[] data, int size) {
	public static void bubbleSort(Comparable[] data, int size) {
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j].compareTo(data[j + 1]) > 0) {
//					MyComparable tmp = data[j];
					Comparable tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
	}

}
