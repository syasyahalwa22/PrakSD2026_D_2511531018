package TugasPekan4;

import java.util.Scanner;

public class AntrianLoket_2511531018 {
	int front_1018;
	int rear_1018;
	int size_1018;
	int max_1018;
	String queue_1018[];

	// Constructor
	public AntrianLoket_2511531018(int max) {
	    this.max_1018 = max;
	    front_1018 = 0;
	    rear_1018 = -1;
	    size_1018 = 0;
	    queue_1018 = new String[max];
	}

	// cek kosong
	boolean isEmpty_1018() {
	    return size_1018 == 0;
	}

	// cek penuh
	boolean isFull_1018() {
	    return size_1018 == max_1018;
	}

	// tambah antrian
	void enqueue_1018(String data) {
	    if (isFull_1018()) {
	        System.out.println("Antrian penuh!");
	        return;
	    }
	    rear_1018 = (rear_1018 + 1) % max_1018;
	    queue_1018[rear_1018] = data;
	    size_1018++;
	    System.out.println("Data berhasil ditambahkan ke antrian");
	    }

	// hapus antrian
	void dequeue_1018() {
	    if (isEmpty_1018()) {
	        System.out.println("Antrian kosong!");
	        return;
	    }
	    String data = queue_1018[front_1018];
	    front_1018 = (front_1018 + 1) % max_1018;
	    size_1018--;
	    System.out.println(data + " telah dilayani");
	}

	// tampilkan antrian
	void display_1018() {
	    if (isEmpty_1018()) {
	        System.out.println("Antrian kosong!");
	        return;
	    }
	    System.out.println("Isi antrian:");
	    int i_1018 = front_1018;
	    int no = 1;
	    for (int count = 0; count < size_1018; count++) {
	        System.out.println(no + ". " + queue_1018[i_1018]);
	        i_1018 = (i_1018 + 1) % max_1018;
	        no++;
	    }
	}

	// reverse antrian
	void reverse_1018() {
	    if (isEmpty_1018()) {
	        System.out.println("Antrian kosong!");
	        return;
	    }

	    String temp_1018[] = new String[size_1018];
	    int i_1018 = front_1018;

	    // salin ke array sementara
	    for (int j_1018 = 0; j_1018 < size_1018; j_1018++) {
	        temp_1018[j_1018] = queue_1018[i_1018];
	        i_1018 = (i_1018 + 1) % max_1018;
	    }

	    // balik isi
	    front_1018 = 0;
	    rear_1018 = size_1018 - 1;
	    for (int j_1018 = 0; j_1018 < size_1018; j_1018++) {
	        queue_1018[j_1018] = temp_1018[size_1018 - j_1018 - 1];
	    }

	    System.out.println("Antrian berhasil dibalik!");
	}

	// MAIN PROGRAM
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    AntrianLoket_2511531018 antrian_1018 = new AntrianLoket_2511531018(10);

	    int pilih_1018;

	    do {
	        System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
	        System.out.println("1. Tambah Antrian");
	        System.out.println("2. Hapus Antrian");
	        System.out.println("3. Tampilkan Antrian");
	        System.out.println("4. Reverse");
	        System.out.println("5. Keluar");
	        System.out.print("Pilih menu: ");
	        pilih_1018 = sc.nextInt();
	        sc.nextLine(); 

	        switch (pilih_1018) {
	            case 1:
	                System.out.print("Masukkan nama pelanggan: ");
	                String nama = sc.nextLine();
	                antrian_1018.enqueue_1018(nama);
	                break;

	            case 2:
	                antrian_1018.dequeue_1018();
	                break;

	            case 3:
	                antrian_1018.display_1018();
	                break;

	            case 4:
	                antrian_1018.reverse_1018();
	                break;

	            case 5:
	                System.out.println("Program selesai");
	                break;

	            default:
	                System.out.println("Pilihan tidak valid!");
	        }

	    } while (pilih_1018 != 5);

	    sc.close();
	}

}