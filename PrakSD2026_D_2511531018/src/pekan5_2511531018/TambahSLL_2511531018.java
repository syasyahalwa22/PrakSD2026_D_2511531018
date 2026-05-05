package pekan5_2511531018;

public class TambahSLL_2511531018 {
	public static NodeSLL_2511531018 insertAtFront_1018(NodeSLL_2511531018 head_1018, int value_1018) {
		NodeSLL_2511531018 new_node_1018 = new NodeSLL_2511531018(value_1018);
		new_node_1018.next_1018=head_1018;
		return new_node_1018;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511531018 insertAtEnd_1018(NodeSLL_2511531018 head_1018, int value_1018) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511531018 newNode_1018=new NodeSLL_2511531018(value_1018);
		// jika list kosong maka node jadi head
		if (head_1018 == null) {
			return newNode_1018;
		}
		//simpan ead ke variabel sementara
		NodeSLL_2511531018 last_1018 = head_1018;
		// telusuri ke node akhir
		while (last_1018.next_1018 != null) {
			last_1018=last_1018.next_1018;
		}
		//ubah pointer
		last_1018.next_1018 = newNode_1018;
		return head_1018;
	}
	static NodeSLL_2511531018 GetNode_1018(int data_1018) {
		return new NodeSLL_2511531018(data_1018);
	}
	static NodeSLL_2511531018 insertPos_1018(NodeSLL_2511531018 headNode, int position_1018, int value_1018) {
		NodeSLL_2511531018 head_1018 = headNode;
		if(position_1018 < 1)
			System.out.print("Invalid position");
		if(position_1018 == 1) {
			NodeSLL_2511531018 new_node_1018 = new NodeSLL_2511531018(value_1018);
			new_node_1018.next_1018=head_1018;
			return new_node_1018;
		} else {
			while (position_1018-- != 0) {
				if (position_1018==1) {
					NodeSLL_2511531018 newNode_1018 = GetNode_1018(value_1018);
					newNode_1018.next_1018=headNode.next_1018;
					headNode.next_1018 = newNode_1018;
					break;
				}
				headNode=headNode.next_1018;
			}
			if (position_1018 != 1) 
		System.out.print("Posisi di luar jangkauan");
		return head_1018;		
		}
		}
	public static void printList_1018(NodeSLL_2511531018 head_1018) {
		NodeSLL_2511531018 curr_1018 = head_1018;
		while (curr_1018.next_1018 != null) {
			System.out.print(curr_1018.data_1018+"-->");
			curr_1018 = curr_1018.next_1018;
		}
		if (curr_1018.next_1018==null) {
			System.out.print(curr_1018.data_1018);
			System.out.println();
		}
	}
		public static void main(String[] args) {
			//buat linked list 2->3->5->6
			NodeSLL_2511531018 head_1018 = new NodeSLL_2511531018(2);
			head_1018.next_1018 = new NodeSLL_2511531018(3);
			head_1018.next_1018.next_1018 = new NodeSLL_2511531018(5);
			head_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(6);
			// cetak list asli
			System.out.print("Senarai berantai awal : ");
			printList_1018(head_1018);
			//tambahkan node baru didepan
			System.out.print("tambah 1 simpul di depan: ");
			int data_1018 =1;
			head_1018 = insertAtFront_1018(head_1018, data_1018);
			//cetak update list
			printList_1018(head_1018);
			//tambahkan node baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_1018 = 7;
			head_1018 = insertAtEnd_1018(head_1018, data2_1018);
			//cetak update list
			printList_1018(head_1018);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_1018 = 4;
			int pos_1018 = 4;
			head_1018 = insertPos_1018(head_1018, pos_1018, data3_1018);
			//cetak update list 
			printList_1018(head_1018);
		}
}
