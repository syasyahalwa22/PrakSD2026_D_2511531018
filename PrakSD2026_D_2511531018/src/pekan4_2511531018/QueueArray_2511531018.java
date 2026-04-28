package pekan4_2511531018;

public class QueueArray_2511531018 {
	int front_1018, rear_1018, size_1018;
	int capacity_1018;
	int array_1018[];
	
	public QueueArray_2511531018(int capacity) {
		this.capacity_1018 = capacity;
		front_1018 = this.size_1018 = 0;
		rear_1018 = capacity - 1;
		array_1018 = new int[this.capacity_1018];
		
	}
	 boolean isFull_1018(QueueArray_2511531018 queue_1018) {
		 return (queue_1018.size_1018 == queue_1018.capacity_1018);
	 }
	 boolean isEmpty_1018(QueueArray_2511531018 queue_1018) {
		 return (queue_1018.size_1018 == 0);
	 }
	 void enqueue_1018(int item) {
		 if (isFull_1018(this))
			 return;
		 this.rear_1018 = (this.rear_1018 + 1) % this.capacity_1018;
		 this.array_1018[this.rear_1018] = item;
		 this.size_1018 = this.size_1018 + 1;
		 System.out.println(item + " enqueued to queue");
	 }
	 int dequeue_1018() {
		 if (isEmpty_1018(this))
			 return Integer.MIN_VALUE;
		 int item = this.array_1018[this.front_1018];
		 this.front_1018 = (this.front_1018 + 1) % this.capacity_1018;
		 this.size_1018 = this.size_1018 - 1;
		 return item;
	 }
	 int front_1018() {
		 if (isEmpty_1018(this))
			 return Integer.MIN_VALUE;
		 
		 return this.array_1018[this.front_1018];
	 }
	 int rear_1018() {
		 if (isEmpty_1018(this))
			 return Integer.MIN_VALUE;
		 return this.array_1018[this.rear_1018];
	 }
	 	//mencetak elemen antrian
	 void display_1018() {
		 int i_1018;
		 if (front_1018 == rear_1018) {
			 System.out.printf("\nAntrian Kosong\n");
			 return;
		 }
		 	//kunjungi dari belakang dan cetak
		 	for (i_1018 = front_1018; i_1018 < rear_1018; i_1018++) {
		 		System.out.printf(" %d <-- ", array_1018[i_1018]);
		 	}
		 	return;
	}
}
