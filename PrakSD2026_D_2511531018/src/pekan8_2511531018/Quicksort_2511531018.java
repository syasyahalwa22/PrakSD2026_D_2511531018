package pekan8_2511531018;

public class Quicksort_2511531018 {
	static void swap(int[] arr_1018, int i_1018, int j_1018) {
		int temp_1018 = arr_1018[i_1018];
		arr_1018[i_1018] = arr_1018[j_1018];
		arr_1018[j_1018] = temp_1018;
	}
	// metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_2511531018(int[] arr_1018, int low_1018, int high_1018) {
		int mid_1018 = low_1018 + (high_1018 - low_1018) /2;
		
		// Urutkan elemen low, mid, dan high
		if (arr_1018[low_1018] > arr_1018[mid_1018]) {
			swap(arr_1018, low_1018, mid_1018);
		}
		if (arr_1018[low_1018] > arr_1018[high_1018]) {
			swap(arr_1018, low_1018, high_1018);
		}
		if (arr_1018[mid_1018] > arr_1018[high_1018]) {
			swap(arr_1018, mid_1018, high_1018);
		}
		swap(arr_1018, mid_1018, high_1018);
	}
	static int partition_2511531018(int[] arr_1018, int low_1018, int high_1018) {
		// panggil fungsi medianofThree sebelum menentukan pivot
		medianOfThree_2511531018(arr_1018, low_1018, high_1018);
		
		int pivot_1018=arr_1018[high_1018]; // sekarang arr[high] sudah berisi nilai median
		int i_1018 = (low_1018 - 1);
		
		for (int j_1018 = low_1018; j_1018 <= high_1018 - 1; j_1018++) {
			// jika elemen saat ini lebih kecil dari atau sama engan pivot
			if (arr_1018[j_1018] < pivot_1018) {
				// increment indeks elemen yang lebih kecil
				i_1018++;
				swap(arr_1018, i_1018, j_1018);
			}
		}
		swap(arr_1018, i_1018 + 1, high_1018);
		return (i_1018 + 1);
	}
	
	static void quickSort_2511531018(int[] arr_1018, int low_1018, int high_1018) {
		if (low_1018 < high_1018) {
			int pi_1018 = partition_2511531018(arr_1018, low_1018, high_1018);
			quickSort_2511531018(arr_1018, low_1018, pi_1018 - 1);
			quickSort_2511531018(arr_1018, pi_1018 + 1, high_1018);
		}
	}

	static void printArr_2511531018(int[] arr_1018) {
		for (int i_1018 = 0; i_1018 < arr_1018.length ; i_1018++) {
			System.out.print(arr_1018[i_1018] + " ");
		}
		System.out.println();	
	}
	
	public static void main(String[] args) {
		int[] arr_1018 = { 10, 7, 8, 9, 1, 5 };
		int N_1018=arr_1018.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2511531018(arr_1018);
		
		quickSort_2511531018(arr_1018, 0, N_1018 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_2511531018(arr_1018);
	}
}

