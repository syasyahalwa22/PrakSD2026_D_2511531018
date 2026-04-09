package pekan3_2511531018;

import java.util.Scanner;
import java.util.Stack;

public class StackPostFix_2511531018 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s_1018 = new Stack<Integer>();
		Scanner input_1018 = new Scanner (expression);
		while (input_1018.hasNext()) {
			if (input_1018.hasNextInt()) {  // an operand (integer)
				s_1018.push(input_1018.nextInt());
			} else {
				String operator = input_1018.next();
				int operand2 = s_1018.pop();
				int operand1 = s_1018.pop();
				if (operator.equals("+")) {
					s_1018.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s_1018.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s_1018.push(operand1 * operand2);
				} else {
					s_1018.push(operand1 / operand2);
				
				}
			}
		}
		input_1018.close();
		return s_1018.pop();
		}
	public static void main (String[] args) {
		System.out.println("hasil postfix= " +postfixEvaluate("5 2 4 * + 7 -"));
	}

}
