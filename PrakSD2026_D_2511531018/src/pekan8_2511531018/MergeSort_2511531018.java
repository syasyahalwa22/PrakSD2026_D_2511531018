package pekan8_2511531018;

public class MergeSort_2511531018 {
	void merge_2511531018(int[] arr_1018, int l_1018, int m_1018, int r_1018) {
		// Find sizes of two subarrays to be merged
		int n1_1018 = m_1018 - l_1018 + 1;
		int n2_1018 = r_1018 - m_1018;
		/* Create temp arrays */
		int L_1018[] = new int[n1_1018];
		int R_1018[] = new int[n2_1018];
		/* Copy data to temp arrays */
		for (int i_1018 = 0; i_1018 < n1_1018; ++i_1018)
			L_1018[i_1018] = arr_1018[l_1018 + i_1018];
		for (int j_1018 = 0; j_1018 < n2_1018; ++j_1018)
			R_1018[j_1018] = arr_1018[m_1018 + 1 + j_1018];
		int i_1018 = 0, j_1018 = 0;
		// Initial index of merged subarray array
		int k_1018 = l_1018;
		while (i_1018 < n1_1018 && j_1018 < n2_1018) {
			if (L_1018[i_1018] <= R_1018[j_1018]) {
				arr_1018[k_1018] = L_1018[i_1018];
				i_1018++;
			} else {
				arr_1018[k_1018] = R_1018[j_1018];
				j_1018++;
			}
			k_1018++;
		}
		/* Copy remaining elements of L[] if any */
		while (i_1018 < n1_1018) {
			arr_1018[k_1018] = L_1018[i_1018];
			i_1018++;
			k_1018++;
		}
		/* Copy remaining elements of R[] if any */
		while (j_1018 < n2_1018) {
			arr_1018[k_1018] = R_1018[j_1018];
			j_1018++;
			k_1018++;
		}
	}
	void sort_2511531018(int arr_1018[], int l_1018, int r_1018) {
		if (l_1018 < r_1018) {
			// Find the middle point
			int m_1018 = (l_1018 + r_1018) / 2;
			// Sort first and second halves
			sort_2511531018(arr_1018, l_1018, m_1018);
			sort_2511531018(arr_1018, m_1018 + 1, r_1018);
			// Merge the sorted halves
			merge_2511531018(arr_1018, l_1018, m_1018, r_1018);
		}
	}
	/* A utility fnction to print array of size n */
	static void printArray_2511531018(int arr_1018[]) {
		int n_1018 = arr_1018.length;
		for (int i_1018 = 0; i_1018 < n_1018; ++i_1018) 
			System.out.print(arr_1018[i_1018] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr_1018[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_2511531018(arr_1018);
		MergeSort_2511531018 ob = new MergeSort_2511531018();
		ob.sort_2511531018(arr_1018, 0, arr_1018.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_2511531018(arr_1018);
	}
}
