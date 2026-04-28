package pekan4_2511531018;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511531018 {
	public static void main(String[] args) 
	{
		Queue<String> q_1018=new LinkedList<>();
		
		q_1018.add("Praktikum");
		q_1018.add("Struktur");
		q_1018.add("Data");
		q_1018.add("Dan");
		q_1018.add("Algoritma");
		Iterator<String> iterator = q_1018.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
