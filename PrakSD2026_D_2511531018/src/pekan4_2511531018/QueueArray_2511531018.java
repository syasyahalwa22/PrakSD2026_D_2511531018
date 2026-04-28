package pekan4_2511531018;

public class QueueArray_2511531018 {
	int front_1018, rear_1018, size_1018;
	int capacity_1018;
	int array_1018[];
	
	public QueueArray_2511531018(int capacity) {
		this.capacity_1018 = capacity_1018;
		front_1018 = this.size_1018 = 0;
		rear_1018 = capacity_1018 - 1;
		array_1018 = new int[this.capacity_1018];
		
	}
	 boolean isFull(QueueArray_2511531018 queue) {
		 return (queue.size_1018 == queue.capacity_1018);
	 }
	 boolean isEmpty(QueueArray_2511531018 queue) {
		 return (queue.size_1018 == 0);
	 }
	 void enqueue(int item) {
		 if (isFull(this))
			 return;
		 this.rear_1018 = (this.rear_1018 + 1) % this.capacity_1018;
		 this.array_1018[this.rear_1018] = item;
		 this.size_1018 = this.size_1018 + 1;
		 System.out.println(item + " enqueued to queue");
	 }
	 int dequeue_1018() {
		 if (isEmpty(this))
			 return Integer.MIN_VALUE;
		 int item_1018 = this.array_1018[this.front_1018];
		 this.front_1018 = (this.front_1018 + 1) % this.capacity_1018;
		 this.size_1018 = this.size_1018 - 1;
		 return item_1018;
	 }
	 int front_1018() {
		 if (isEmpty(this))
			 return Integer.MIN_VALUE;
		 
		 return this.array_1018[this.front_1018];
	 }
	 int rear_1018() {
		 if (isEmpty(this))
			 return Integer.MIN_VALUE;
		 return this.array_1018[this.rear_1018];
	 }
	 	//mencetak elemen antrian
	 void display_1018() {
		 int i;
		 if (front_1018 == rear_1018) {
			 System.out.printf("\nAntrian Kosong\n");
			 return;
		 }
		 	//kunjungi dari belakang dan cetak
		 	for (i = front_1018; i < rear_1018; i++) {
		 		System.out.printf(" %d <-- ", array_1018[i]);
		 	}
		 	return;
	}
}
