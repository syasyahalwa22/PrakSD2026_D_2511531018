package pekan6; 

public class insertDLL_2511531018 {
	// menambahkan node diawal DLL
	static NodeDLL_2511531018 insertBegin_1018(NodeDLL_2511531018 head_1018, int data_1018) {
		// buat node baru
		NodeDLL_2511531018 new_node_1018 = new NodeDLL_2511531018(data_1018);
		// jadikan pointer nextnya head
		new_node_1018.next_1018 = head_1018;
		// jadikan pointer prev head ke new_node
		if (head_1018 != null) {
			head_1018.prev_1018 = new_node_1018;
		}
		return new_node_1018;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511531018 insertEnd_1018(NodeDLL_2511531018 head_1018, int newData_1018) {
		//buat node baru
		NodeDLL_2511531018 newNode_1018 = new NodeDLL_2511531018(newData_1018);
		// jika dll null jadikan head
		if (head_1018 == null) {
			head_1018 = newNode_1018;
		}
		else {
			NodeDLL_2511531018 curr_1018 = head_1018;
			while (curr_1018.next_1018 != null) {
				curr_1018 = curr_1018.next_1018;
			}
			curr_1018.next_1018 = newNode_1018;
			newNode_1018.prev_1018 = curr_1018;
		}
		return head_1018;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511531018 insertAtPosition_1018(NodeDLL_2511531018 head_1018, int pos_1018, int new_data_1018) {
		// buat node baru
		NodeDLL_2511531018 new_node_1018 = new NodeDLL_2511531018(new_data_1018);
		if (pos_1018 == 1) {
			new_node_1018.next_1018 = head_1018;
			if (head_1018 != null) {
				head_1018.prev_1018 = new_node_1018; }
			head_1018 = new_node_1018;
			return head_1018; }
		NodeDLL_2511531018 curr_1018 = head_1018;
	for(int i_1018 = 1; i_1018 < pos_1018 - 1 && curr_1018 != null; ++i_1018) {
			curr_1018 = curr_1018.next_1018; }
		if (curr_1018 == null) {
			System.out.println("Posisi tidak ada");
			return head_1018; }
		new_node_1018.prev_1018 = curr_1018;
		new_node_1018.next_1018 = curr_1018.next_1018;
		curr_1018.next_1018 = new_node_1018;
		if (new_node_1018.next_1018 != null) {
			new_node_1018.next_1018.prev_1018 = new_node_1018; }
		return head_1018; 

		} 
	
		public static void printList_1018(NodeDLL_2511531018 head_1018) {
			NodeDLL_2511531018 curr_1018 = head_1018;
			while (curr_1018 != null) {
				System.out.print(curr_1018.data_1018 + " <-> ");
				curr_1018 = curr_1018.next_1018;
			}
			System.out.println();
		}
		public static void main(String[] args) {
			// membuat dll 2 <-> 3 <-> 5
			NodeDLL_2511531018 head_1018 = new NodeDLL_2511531018(2);
			head_1018.next_1018 = new NodeDLL_2511531018(3);
			head_1018.next_1018.prev_1018 = head_1018;
			head_1018.next_1018.next_1018 = new NodeDLL_2511531018(5);
			head_1018.next_1018.next_1018.prev_1018 = head_1018.next_1018;
			//cetak DLLawal
			System.out.print("DLL Awal: ");
			printList_1018(head_1018);
			//tambah 1 di awal
			head_1018 = insertBegin_1018(head_1018, 1);
			System.out.print(
					"simpul 1 ditambah di awal: ");
				printList_1018(head_1018);
			// tambah 6 di akhir
				System.out.print(
						"simpul 6 ditambah di ahir: ");
				int data_1018 = 6;
				head_1018 = insertEnd_1018(head_1018, data_1018);
				printList_1018(head_1018);
				//menambah node 4 di posisi 4
				System.out.print("tambah node 4 di posisi 4: ");
				int data2_1018 = 4;
				int pos_1018 = 4;
				head_1018 = insertAtPosition_1018(head_1018, pos_1018, data2_1018);
				printList_1018(head_1018);
		}
	}
	
