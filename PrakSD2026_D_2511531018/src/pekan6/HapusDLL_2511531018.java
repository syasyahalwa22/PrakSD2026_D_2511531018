package pekan6;

public class HapusDLL_2511531018 {
	// fungsi mengahpus node awal
	public static NodeDLL_2511531018 delHead_1018(NodeDLL_2511531018 head_1018) {
		if (head_1018 == null) {
			return null; }
			NodeDLL_2511531018 temp_1018 = head_1018;
			head_1018 = head_1018.next_1018;
			if (head_1018 != null) {
				head_1018.prev_1018 = null; }
				return head_1018;
			}
		//fungsi menghapus di akhir
		public static NodeDLL_2511531018 delLast_1018(NodeDLL_2511531018 head_1018) {
			if (head_1018 == null) {
				return null; }
				if (head_1018.next_1018 == null) {
					return null; }
				NodeDLL_2511531018 curr_1018 = head_1018;
				while (curr_1018.next_1018 != null) {
					curr_1018 = curr_1018.next_1018;
				}
				//update pointer previous node
				if (curr_1018.prev_1018 != null) {
					curr_1018.prev_1018.next_1018 = null; }
				return head_1018;
				}	
		// fungsi menghapus node posisi tertentu
			public static NodeDLL_2511531018 delPos_1018(NodeDLL_2511531018 head_1018, int pos_1018) {
				// JIKA DLL kosong
				if (head_1018 == null) {
					return head_1018; }
				NodeDLL_2511531018 curr_1018 = head_1018;
				//telusuri sampai ke node yang akan dihapus
				for (int i_1018 = 1; curr_1018 != null && i_1018 < pos_1018; ++i_1018) {
					curr_1018 = curr_1018.next_1018; }
				// jika posisi tidak ditemukan
				if (curr_1018 == null) {
					return head_1018; }
				// update pointer
				if (curr_1018.prev_1018 != null) {
					curr_1018.prev_1018.next_1018 = curr_1018.next_1018;}
				if (curr_1018.next_1018 != null) {
					curr_1018.next_1018.prev_1018 = curr_1018.prev_1018; }
				// jika yang dihapus head
				if (head_1018 == curr_1018) {
					head_1018 = curr_1018.next_1018; }
				return head_1018;
				}
			// fungsi mencetak DLL
			public static void printList_1018(NodeDLL_2511531018 head_1018) {
				NodeDLL_2511531018 curr_1018 = head_1018;
				while (curr_1018 != null) {
					System.out.print(curr_1018.data_1018 + " <-> ");
					curr_1018 = curr_1018.next_1018;
				}
				System.out.println();
			}
		public static void main(String[] args) {
			// buat sebuah DLL
			NodeDLL_2511531018 head_1018 = new NodeDLL_2511531018(1);
			head_1018.next_1018 = new NodeDLL_2511531018(2);
			head_1018.next_1018.prev_1018 = head_1018;
			head_1018.next_1018.next_1018 = new NodeDLL_2511531018(3);
			head_1018.next_1018.next_1018.prev_1018 = head_1018.next_1018;
			head_1018.next_1018.next_1018.next_1018 = new NodeDLL_2511531018(4);
			head_1018.next_1018.next_1018.next_1018.prev_1018 = head_1018.next_1018;
			head_1018.next_1018.next_1018.next_1018.next_1018 = new NodeDLL_2511531018(5);
			head_1018.next_1018.next_1018.next_1018.next_1018.prev_1018 = head_1018.next_1018.next_1018.next_1018;
			
			System.out.print("DLL Awal: ");
			printList_1018(head_1018);
			
			System.out.print("Setelah head dihapus: ");
			head_1018 = delHead_1018(head_1018);
			printList_1018(head_1018);
			
			System.out.print("Setelah node terakhir dihapus: ");
			head_1018 = delLast_1018(head_1018);
			printList_1018(head_1018);
			
			System.out.print("menghapus node ke 2: ");
			head_1018 = delPos_1018(head_1018, 2);
			
			printList_1018(head_1018);
		}
}
