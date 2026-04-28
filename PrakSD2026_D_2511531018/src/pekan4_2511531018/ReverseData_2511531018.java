package pekan4_2511531018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511531018 {
	public static void main(String[] args) {
		Queue<Integer> q_1018 = new LinkedList<Integer>();
		q_1018.add(1);
		q_1018.add(2);
		q_1018.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse = " + q_1018);
		Stack<Integer> s=new Stack<Integer>();
		while (!q_1018.isEmpty()) { // Q -> S
			s.push(q_1018.remove());
		}
		while (!s.isEmpty()) { //S->Q
			q_1018.add(s.pop());
		}
		System.out.println("sesudah reverse = " + q_1018); // [3, 2, 1]	                       
	}
}
