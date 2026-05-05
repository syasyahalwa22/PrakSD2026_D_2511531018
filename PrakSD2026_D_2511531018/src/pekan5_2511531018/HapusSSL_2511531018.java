package pekan5_2511531018;

public class HapusSSL_2511531018 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511531018 deleteHead_1018(NodeSLL_2511531018 head_1018) {
		//jika SLL kosong
		if (head_1018 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_1018 = head_1018.next_1018;
		//return head baru
		return head_1018; }
		//fungsi menghapus node terakhir SLL
		public static NodeSLL_2511531018 removeLastNode_1018(NodeSLL_2511531018 head_1018) {
			//jika list kosong, return null
			if (head_1018 == null) {
				return null;
			}
			//jika list satu node, hapus node dan return null
			if (head_1018.next_1018 == null) {
				return null;
			}
			//temukan node tarakhir ke dua
			NodeSLL_2511531018 secondLast_1018 = head_1018;
			while (secondLast_1018.next_1018.next_1018 != null) {
				secondLast_1018 = secondLast_1018.next_1018;
			}
			//hapus node terakhir
			secondLast_1018.next_1018 = null;
			return head_1018; }
		
			// fungsi menghapus node di posisi tertentu
			public static NodeSLL_2511531018 deleteNode_1018(NodeSLL_2511531018 head_1018, int position_1018) {
				NodeSLL_2511531018 temp_1018 = head_1018;
				NodeSLL_2511531018 prev_1018 = null;
				//jika linked list null
				if (temp_1018 == null)
					return head_1018;
				//kasus 1: head dihapus
				if (position_1018 == 1) {
					head_1018 = temp_1018.next_1018;
					return head_1018; }
					//kasus 2: mengahpus node ditengah
					//telusuri ke node yang dihapus
					for (int i_1018 = 1; temp_1018 != null && i_1018 < position_1018; i_1018++) {
						prev_1018 = temp_1018;
						temp_1018 = temp_1018.next_1018; }
					//jika ditemukan, hapus node
					if (temp_1018 != null) {
						prev_1018.next_1018 = temp_1018.next_1018;
					} else {
						System.out.println("Data tidak ada"); }
						return head_1018; }
			
					// fungsi mencetak SLL
					public static void printList_1018(NodeSLL_2511531018 head_1018) {
						NodeSLL_2511531018 curr_1018 = head_1018;
						while (curr_1018.next_1018 != null) {
							System.out.print(curr_1018.data_1018+"-->");
						curr_1018 = curr_1018.next_1018; }
						if (curr_1018.next_1018 == null) {
							System.out.print(curr_1018.data_1018); }
							System.out.println(); }
					//kelas main
					public static void main(String[] args) {
						//buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
						NodeSLL_2511531018 head_1018 = new NodeSLL_2511531018(1);
						head_1018.next_1018 = new NodeSLL_2511531018(2);
						head_1018.next_1018.next_1018 = new NodeSLL_2511531018(3);
						head_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(4);
						head_1018.next_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(5);
						head_1018.next_1018.next_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(6);
						// cetak list awal
						System.out.println("list awal: ");
						printList_1018(head_1018);
						//hapus head
						head_1018 = deleteHead_1018(head_1018);
						System.out.println("List setelah simpul terakhir di hapus: ");
						printList_1018(head_1018);
						//hapus node terakhir
						head_1018 = removeLastNode_1018(head_1018);
						System.out.println("List setelahsimpul terakhir di hapus: ");
						printList_1018(head_1018);
						//Deleting node at position 2
						int position_1018 = 2;
						head_1018 = deleteNode_1018(head_1018, position_1018);
						//print list after deletion
						System.out.println("List setelah posisi 2 dihapus: ");
						printList_1018(head_1018);
					}
}
