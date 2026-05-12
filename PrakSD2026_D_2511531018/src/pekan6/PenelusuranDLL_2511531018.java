package pekan6;

public class PenelusuranDLL_2511531018 {
	// fungsi penelusuran maju
	static void forwardTraversal_1018(NodeDLL_2511531018 head_1018) {
		// memulai penelusuran dari head
		NodeDLL_2511531018 curr_1018 = head_1018;
		// lanjutkan sampai akhir
		while (curr_1018 != null) {
			//print data
			System.out.print(curr_1018.data_1018 + " <-> ");
			// pindah ke node berikutnya
			curr_1018 = curr_1018.next_1018;
		}
		//print spasi
		System.out.println();
	}
	// fungsi penelusuran mun dur
	static void backwardTraversal_1018(NodeDLL_2511531018 tail_1018) {
		// mulai dari akhir
		NodeDLL_2511531018 curr_1018 = tail_1018;
		//lanjut sampai head
		while (curr_1018 != null) {
			// cetak data
			System.out.print(curr_1018.data_1018 + " <-> ");
			//pindah ke node sebelumnya
			curr_1018 = curr_1018.prev_1018;
		}
	//cetak spasi
	System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511531018 head_1018 = new NodeDLL_2511531018(1);
		NodeDLL_2511531018 second_1018 = new NodeDLL_2511531018(2);
		NodeDLL_2511531018 third_1018 = new NodeDLL_2511531018(3);
		
		head_1018.next_1018 = second_1018;
		second_1018.prev_1018 = head_1018;
		second_1018.next_1018 = third_1018;
		third_1018.prev_1018 = second_1018;
		
		System.out.println("Penelusuran maju:");
		forwardTraversal_1018(head_1018);
		
		System.out.println("Penelusuran mundur:");
		backwardTraversal_1018(third_1018);
	}
}
