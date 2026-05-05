package pekan5_2511531018;

public class PencarianSSL_2511531018 {
	static boolean searchKey_1018(NodeSLL_2511531018 head_1018, int key_1018) {
		NodeSLL_2511531018 curr_1018 = head_1018;
		while (curr_1018 != null) {
			if (curr_1018.data_1018 == key_1018)
				return true;
			curr_1018 = curr_1018.next_1018; }
		return false; }
	public static void traversal(NodeSLL_2511531018 head_1018) {
		//mulai dari head
		NodeSLL_2511531018 curr_1018 = head_1018;
		//telusuri sampai pointer null
		while (curr_1018 != null) {
			System.out.print(" " + curr_1018.data_1018);
			curr_1018 = curr_1018.next_1018; }
		System.out.println(); }
	public static void main(String[] args) {
		NodeSLL_2511531018 head_1018 = new NodeSLL_2511531018(14);
		head_1018.next_1018 = new NodeSLL_2511531018(21);
		head_1018.next_1018.next_1018 = new NodeSLL_2511531018(13);
		head_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(30);
		head_1018.next_1018.next_1018.next_1018.next_1018 = new NodeSLL_2511531018(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head_1018);
		//data yang akan dicari
		int key_1018 = 30; 
		System.out.print("cari data " +key_1018+ " = ");
		if (searchKey_1018(head_1018, key_1018))
			System.out.println("Ketemu");
		else
			System.out.println("tidak ada");		
	}
}
