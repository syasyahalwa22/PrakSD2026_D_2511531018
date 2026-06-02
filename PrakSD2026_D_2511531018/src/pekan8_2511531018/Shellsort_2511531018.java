package pekan8_2511531018;

public class Shellsort_2511531018 {
	public static void shellSort_2511531018(int[] A) {
		int n_1018 = A.length;
		int gap_1018 = n_1018 / 2;
		while (gap_1018 > 0) {
			for (int i_1018 = gap_1018; i_1018 < n_1018; i_1018++) {
				int temp_1018 = A[i_1018];
				int j_1018 = i_1018;
				while (j_1018 >= gap_1018 && A[j_1018 - gap_1018] > temp_1018) {
					A[j_1018] = A[j_1018 - gap_1018];
					j_1018 = j_1018 - gap_1018;
				}
				A[j_1018] = temp_1018;
			}
			gap_1018 = gap_1018 / 2;
		}
	}

	public static void main(String[] args) {
		int[] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray(data);
		
		shellSort_2511531018(data);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data);
	}
	
	public static void printArray(int[] arr) {
		for (int i_1018 : arr) System.out.print(i_1018 + " ");
		System.out.println();
			
	}
}
