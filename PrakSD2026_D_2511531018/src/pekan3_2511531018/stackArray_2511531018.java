package pekan3_2511531018;

public class stackArray_2511531018 {
	static final int MAX_1018 = 1000;
	int top_1018;
	int a_1018[] = new int[MAX_1018];
	boolean isEmpty_1018()
	{
		return (top_1018 < 0);
		
	}
	stackArray_2511531018()
	{
		top_1018 = -1;
	}
	boolean push_1018(int x)
	{
		if (top_1018 >= (MAX_1018 - 1)) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a_1018[++top_1018] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_1018() 
	{
		if (top_1018 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} 
		else {
			int x = a_1018[top_1018--];
			return x;
		}
	}
	int peek_1018()
	{
		if (top_1018 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_1018[top_1018];
			return x;
		}
	}
	void print() {
		for(int i = top_1018; i>-1; i--) {
			System.out.print(" "+ a_1018[i]);
		}
				
	}
}
