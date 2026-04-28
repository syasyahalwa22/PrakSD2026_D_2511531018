package pekan4_2511531018;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531018 {
	public static void main(String[] args) {
		Queue<Integer> q_1018 = new LinkedList<>();
		//tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i_1018=0; i_1018<6; i_1018++)
			q_1018.add(i_1018);
		//Menampilkan isi antrian.
		System.out.println("Elemen Antrian " + q_1018);
		// Untuk menghapus kepala antrian.
		int hapus_1018=q_1018.remove();
		System.out.println("Hapus elemen = " + hapus_1018);
		System.out.println(q_1018);
		//Untuk melihat antrian terdepan
		int depan_1018=q_1018.peek();
		System.out.println("Kepala Antrian = " + depan_1018);

		int banyak_1018=q_1018.size();
		System.out.println("Size Antrian = " + banyak_1018);
	}

}
