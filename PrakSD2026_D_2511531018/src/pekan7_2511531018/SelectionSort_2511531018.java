package pekan7_2511531018;

public class SelectionSort_2511531018 {
	public static void selectionSort_2511531018(int[] arr_1018) {
		int n_1018 = arr_1018.length;
		for (int i_1018 = 0; i_1018 < n_1018; i_1018++) {
			int minIndex_1018 = i_1018;
			for (int j_1018 = i_1018 + 1; j_1018 < n_1018; j_1018++) {
				if (arr_1018[j_1018] < arr_1018[minIndex_1018]) {
					minIndex_1018 = j_1018;
				}
			}
			int temp_1018 = arr_1018[i_1018];
			arr_1018[i_1018] = arr_1018[minIndex_1018];
			arr_1018[minIndex_1018] = temp_1018;
		}
	}
	public static void main(String[] args) {
		int arr_1018[] = { 23, 78, 45, 8, 32, 56, 1};
		int n_1018 =arr_1018.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1018 = 0; i_1018 < n_1018; i_1018++)
			System.out.print(arr_1018[i_1018] + " ");
		System.out.println("");
		selectionSort_2511531018(arr_1018);
		System.out.printf("array yang terurut:\n");
		for (int i_1018 = 0; i_1018 < n_1018; i_1018++)
			System.out.print(arr_1018[i_1018] + " ");
		System.out.println("");
		}

}
