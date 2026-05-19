package pekan7_2511531018;

public class InsertionSort_2511531018 {
	public static void insertionSort_2511531018(int[] arr_1018) {
		int n_1018=arr_1018.length;
		for (int i_1018 = 1; i_1018 < n_1018; i_1018++) {
			int key_1018 = arr_1018[i_1018];
			int j_1018 = i_1018 - 1;
			while (j_1018 >= 0 && arr_1018[j_1018] > key_1018) {
				arr_1018[j_1018 + 1] = arr_1018[j_1018];
				j_1018--;
			}
			arr_1018[j_1018 + 1] = key_1018;
		}
		}
	public static void main(String[] args) {
		int arr_1018[] = { 23, 78, 45, 8, 32, 56, 1};
		int n_1018 = arr_1018.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_1018 = 0; i_1018 < n_1018; i_1018++)
			System.out.print(arr_1018[i_1018] + " ");
		System.out.println("");
		insertionSort_2511531018(arr_1018);
		System.out.printf("array yang terurut:\n");
		for(int i_1018 = 0; i_1018 < n_1018; i_1018++)
			System.out.print(arr_1018[i_1018] + " ");
		System.out.println("");
		
	}

}
