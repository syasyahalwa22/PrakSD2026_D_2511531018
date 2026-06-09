package pekan9_2511531018;

public class Node_2511531018 {
	int data_1018;
	Node_2511531018 left_1018;
	Node_2511531018 right_1018;
	public Node_2511531018(int data_1018) {
		this.data_1018 = data_1018;
		left_1018 = null;
		right_1018 = null;
	}
	public void setLeft_1018(Node_2511531018 node) {
		if (left_1018 == null) 
			left_1018 = node;
	}
	public void setRight_1018(Node_2511531018 node) {
		if (right_1018 == null) 
			right_1018 = node;
	}
	public Node_2511531018 getLeft_1018() {
		return left_1018;	
	}
	public Node_2511531018 getRight_1018() {
		return right_1018;
		
	}
	public int getData_1018() {
		return data_1018;	
	}
	public void setData_1018(int data_1018) {
		this.data_1018 = data_1018;
	}
	void printPreorder_1018(Node_2511531018 node) {
		if (node == null)
			return;
		System.out.print(node.data_1018 + " ");
		printPreorder_1018(node.left_1018);
		printPreorder_1018(node.right_1018);
	}
	void printPostorder_1018(Node_2511531018 node) {
		if (node == null) 
			return;
		printPostorder_1018(node.left_1018);
		printPostorder_1018(node.right_1018);
		System.out.print(node.data_1018 + " ");
	}
	void printInorder_1018(Node_2511531018 node) {
		if (node == null)
			return;
		printInorder_1018(node.left_1018);
		System.out.print(node.data_1018 + " ");
		printInorder_1018(node.right_1018);
	}
	public String print_1018() {
		return this.print_1018("",true,"");
	}
	public String print_1018(String prefix_1018, boolean isTail_1018, String sb_1018) {
		if (right_1018 != null) {
			right_1018.print_1018(prefix_1018 + (isTail_1018 ? "|   " : "   "), false, sb_1018);
		}
		System.out.println( prefix_1018+(isTail_1018 ? "\\-- " : "/-- ")+data_1018);
		if (left_1018 != null) {
			left_1018.print_1018(prefix_1018+(isTail_1018 ? "   " : "|   "), true, sb_1018);
		}
		return sb_1018;
	
	}
}
