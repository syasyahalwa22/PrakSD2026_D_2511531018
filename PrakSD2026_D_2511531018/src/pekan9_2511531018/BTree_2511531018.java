package pekan9_2511531018;

public class BTree_2511531018 {
	private Node_2511531018 root_1018;
	private Node_2511531018  currentNode_1018;
	public BTree_2511531018() {
		root_1018 = null;   
	}
	public boolean search_1018(int data_1018) {
		return search_1018(root_1018, data_1018);
	}
	private boolean search_1018(Node_2511531018 node, int data_1018) {
		if (node.getData_1018() == data_1018)
			return true;
		if (node.getLeft_1018() != null)
			if (search_1018(node.getLeft_1018(), data_1018))
				return true;
		if (node.getRight_1018() != null)
			if (search_1018(node.getRight_1018(), data_1018))
				return true;
		return false;	
	}
	public void printInorder_1018() {
		root_1018.printInorder_1018(root_1018);

	}
	public void printPreorder_1018() {
		root_1018.printPreorder_1018(root_1018);
	}
	public void printPostOrder_1018() {
		root_1018.printPostorder_1018(root_1018);
	}
	
	public Node_2511531018 getRoot_1018() {
		return root_1018;
	}
	 public boolean isEmpty_1018() {
		 return root_1018 == null;
	 }
	 
	 public int countNodes_1018() {
		 return countNodes_1018(root_1018);
	 }
	 
	 private int countNodes_1018(Node_2511531018 node) {
		 int count_1018 = 1;
		 if (node == null) {
			 return 0;
		 } else {
			 count_1018 += countNodes_1018(node.getLeft_1018());
			 count_1018 += countNodes_1018(node.getRight_1018());
			 return count_1018;
		 }
	 }
	 
	 public void print_1018() {
		 root_1018.print_1018();
	 }
	
	 public Node_2511531018 getCurrent_1018() {
		 return currentNode_1018;
	 }
	 public void setCurrent_1018(Node_2511531018 node) {
		 this.currentNode_1018 = node;
	 }
	 public void setRoot_1018(Node_2511531018 root_1018) {
		 this.root_1018 = root_1018;
	 }
} 
