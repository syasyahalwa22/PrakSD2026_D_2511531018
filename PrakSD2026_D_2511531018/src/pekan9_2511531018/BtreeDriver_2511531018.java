package pekan9_2511531018;

public class BtreeDriver_2511531018 {
	public static void main(String[] args) {
		//Membuat Pohon
		BTree_2511531018 tree_1018 = new BTree_2511531018();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1018.countNodes_1018());
		//menambahkan simpul data 1
		Node_2511531018 root_1018 = new Node_2511531018(1);
		//menjadikan simpul 1 sebagai root
		tree_1018.setRoot_1018(root_1018);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1018.countNodes_1018());
		Node_2511531018 node2_1018 = new Node_2511531018(2);
		Node_2511531018 node3_1018 = new Node_2511531018(3);
		Node_2511531018 node4_1018 = new Node_2511531018(4);
		Node_2511531018 node5_1018 = new Node_2511531018(5);
		Node_2511531018 node6_1018 = new Node_2511531018(6);
		Node_2511531018 node7_1018= new Node_2511531018(7);
		Node_2511531018 node8_1018 = new Node_2511531018(8);
		Node_2511531018 node9_1018 = new Node_2511531018(9);
		root_1018.setLeft_1018(node2_1018);
		node2_1018.setLeft_1018(node4_1018);
		node2_1018.setRight_1018(node5_1018);
		node4_1018.setRight_1018(node8_1018);
		root_1018.setRight_1018(node3_1018);
		node3_1018.setLeft_1018(node6_1018);
		node3_1018.setRight_1018(node7_1018);
		node6_1018.setLeft_1018(node9_1018);
		
		//Set root
		tree_1018.setCurrent_1018(tree_1018.getRoot_1018());
		System.out.println("menampilkan simpul terakhir");
		System.out.println(tree_1018.getCurrent_1018().getData_1018());
		System.out.println("Jumlah sumpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_1018.countNodes_1018());
		System.out.println("Inorder: ");
		tree_1018.printInorder_1018();
		System.out.println("\nPreorder: ");
		tree_1018.printPreorder_1018();
		System.out.println("\nPostorder: ");
		tree_1018.printPostOrder_1018();
		System.out.println("\nmenampilkan simpul dalam bentuk pohon");
		tree_1018.print_1018();
	}

}
