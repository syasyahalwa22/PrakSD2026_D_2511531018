package pekan5_2511531018;

import java.util.Scanner;

public class RumahSakit_2511531018 {
	// variabel untuk menyimpan nomor antrian otomatis
	static int counter_1018 = 0;
	
	// fungsi menambahkan pasien ke akhir linked list
	 public static Pasien_2511531018 insertPasien_1018(Pasien_2511531018 head_1018, String nama_1018, String keluhan_1018) {
	        // nomor antrian bertambah setiap pasien baru masuk
		 	counter_1018++;
		 	// membuat node pasien baru
	        Pasien_2511531018 newNode_1018 = new Pasien_2511531018(nama_1018, keluhan_1018, counter_1018);
	        
	        // jika linked list kosong maka node baru menjadi head
	        if (head_1018 == null) {
	            return newNode_1018;
	        }
	        // variabel sementara untuk menelusuri linked list
	        Pasien_2511531018 temp_1018 = head_1018;
	        while (temp_1018.next_1018 != null) {
	            temp_1018 = temp_1018.next_1018;
	        }
	        // menghubungkan node terakhir dengan node baru
	        temp_1018.next_1018 = newNode_1018;
	        // mengembalikan head linked list
	        return head_1018;
	    }
	 	// fungsi memanggil pasien pertama
	    public static Pasien_2511531018 panggilPasien_1018(Pasien_2511531018 head_1018) {
	    	// jika linked list kosong
	    	if (head_1018 == null) {
	            System.out.println("Antrian kosong!");
	            return null;
	        }
	    	// menampilkan data pasien yang dipanggil
	        System.out.println("Memanggil:");
	        System.out.println("Nama      : " + head_1018.nama_1018);
	        System.out.println("Keluhan   : " + head_1018.keluhan_1018);
	        System.out.println("No Antrian: " + head_1018.nomor_1018);
	        // menggeser head ke node berikutnya
	        return head_1018.next_1018;
	    }
	    // fungsi menampilkan seluruh data pasien
	    public static void tampilkan_1018(Pasien_2511531018 head_1018) {
	    	// jika linked list kosong
	    	if (head_1018 == null) {
	            System.out.println("Antrian kosong!");
	            return;
	        }
	    	// variabel untuk traversal linked list
	        Pasien_2511531018 curr_1018 = head_1018;
	        // menelusuri node dari head sampai null
	        while (curr_1018 != null) {
	            System.out.println(curr_1018.nomor_1018 + ". " + curr_1018.nama_1018 + " - " + curr_1018.keluhan_1018);
	            curr_1018 = curr_1018.next_1018;
	        }
	    }
	    // fungsi mencari pasien berdasarkan nama
	    public static void cari_1018(Pasien_2511531018 head_1018, String namaCari_1018) {
	    	// variabel untuk traversal linked list
	    	Pasien_2511531018 curr_1018 = head_1018;
	    	// menelusuri linked list sampai data ditemukan
	        while (curr_1018 != null) {
	            if (curr_1018.nama_1018.equalsIgnoreCase(namaCari_1018)) {
	                System.out.println("Pasien ditemukan:");
	                System.out.println("Nama: " + curr_1018.nama_1018);
	                System.out.println("Keluhan: " + curr_1018.keluhan_1018);
	                return;
	            }
	            // pindah ke node berikutnya
	            curr_1018 = curr_1018.next_1018;
	        }
	        // jika data tidak ditemukan
	        System.out.println("Pasien tidak ditemukan!");
	    }
	    // fungsi mengecek status antrian
	    public static void status_1018(Pasien_2511531018 head_1018) {
	    	// jika linked list kosong
	    	if (head_1018 == null) {
	            System.out.println("Antrian kosong!");
	            return;
	        }

	        int jumlah_1018 = 0;
	        // variabel traversal
	        Pasien_2511531018 curr_1018 = head_1018;
	        // menghitung jumlah node pada linked list
	        while (curr_1018 != null) {
	            jumlah_1018++;
	            curr_1018 = curr_1018.next_1018;
	        }
	        // menampilkan jumlah pasien dan pasien terdepan
	        System.out.println("Jumlah pasien	: " + jumlah_1018);
	        System.out.println("Pasien terdepan	: " + head_1018.nama_1018);
	    }
	    // program utama
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        // head awal linked list bernilai null
	        Pasien_2511531018 head_1018 = null;
	        int pilih_1018;

	        do {
	            System.out.println("\n=== ANTRIAN RUMAH SAKIT ===");
	            System.out.println("1. Daftarkan Pasien	: ");
	            System.out.println("2. Panggil Pasien	: ");
	            System.out.println("3. Tampilkan Antrian	: ");
	            System.out.println("4. Cari Pasien		: ");
	            System.out.println("5. Cek Status Antrian	: ");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            pilih_1018 = input.nextInt();
	            input.nextLine();

	            switch (pilih_1018) {
	                case 1:
	                    System.out.print("Masukka Nama Pasien	: ");
	                    String nama_1018 = input.nextLine();
	                    System.out.print("Masukkan Keluhan	: ");
	                    String keluhan_1018 = input.nextLine();
	                    // menambahkan pasien ke linked list
	                    head_1018 = insertPasien_1018(head_1018, nama_1018, keluhan_1018);
	                    
	                    System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1018);
	                    break;

	                case 2:
	                	// menghapus node pertama
	                    head_1018 = panggilPasien_1018(head_1018);
	                    break;

	                case 3:
	                	// menampilkan seluruh linked list
	                    tampilkan_1018(head_1018);
	                    break;

	                case 4:
	                    System.out.print("Masukkan Nama yang dicari : ");
	                    String cari_1018 = input.nextLine();
	                    // mencari data pasien
	                    cari_1018(head_1018, cari_1018);
	                    break;

	                case 5:
	                	// mengecek status linked list
	                    status_1018(head_1018);
	                    break;
	                    
	                case 6:
	                	System.out.println("Terimakasih!");
	                	break;
	                	
	               default:
	            	   System.out.println("Pilihan tidak valid!");

	            }

	        } while (pilih_1018 != 6);
	    }

	
}
