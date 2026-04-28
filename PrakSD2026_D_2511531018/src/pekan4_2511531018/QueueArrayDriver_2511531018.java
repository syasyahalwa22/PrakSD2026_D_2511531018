package pekan4_2511531018;

public class QueueArrayDriver_2511531018 {
	public static void main(String[] args) {
		QueueArray_2511531018 queue_1018 = new QueueArray_2511531018(1000);
		queue_1018.enqueue_1018(10);
		queue_1018.enqueue_1018(20);
		queue_1018.enqueue_1018(30);
		queue_1018.enqueue_1018(40);
		System.out.println("Item di depan "+ queue_1018.front_1018());
		System.out.println("Item paling belakang "+ queue_1018.rear_1018());
		System.out.println("tampilan queue");
		queue_1018.display_1018();
		System.out.println();
		System.out.println(queue_1018.dequeue_1018() + " dihapus dari queue");
		System.out.println("item di depan:" + queue_1018.front_1018());
		System.out.println("item dibelakang: " + queue_1018.rear_1018());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_1018.display_1018();
	}
}
