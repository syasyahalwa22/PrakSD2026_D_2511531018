package pekan3_2511531018;

public class stackArrayDriver_2511531018 {
	public static void main(String[] args) {
		stackArray_2511531018 s = new stackArray_2511531018();
		s.push_1018(10);
		s.push_1018(20);
		s.push_1018(30);
		System.out.println(s.pop_1018() + " dikeluarakan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_1018());
		System.out.print("Elemen pada stack :");
		s.print();
	}

}
