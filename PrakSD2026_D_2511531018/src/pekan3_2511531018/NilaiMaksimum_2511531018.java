package pekan3_2511531018;

import java.util.Stack;

public class NilaiMaksimum_2511531018 {
	public static int max_1018(Stack<Integer> s_1018) {
		Stack<Integer> backup = new Stack<Integer>() ;
		int max_1018Value = s_1018.pop();
		backup.push(max_1018Value);
		while (!s_1018.isEmpty()) {
			int next = s_1018.pop();
			backup.push(next);
			max_1018Value = Math.max(max_1018Value, next);
		}
		while (!backup.isEmpty()) {
			s_1018.push(backup.pop());
		}
		return max_1018Value;
	}
	public static void main(String[] args) {
		Stack<Integer> s_1018 = new Stack<Integer> ();
		s_1018.push(70);
		s_1018.push(12);
		s_1018.push(20);
		System.out.println("isi stack "+s_1018);
		System.out.println("Stack teratas "+s_1018.peek());
		System.out.println("Nilai maksimum "+max_1018(s_1018));
		
	}

}
