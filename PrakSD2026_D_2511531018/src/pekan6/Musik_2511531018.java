package pekan6;

import java.util.Scanner;

public class Musik_2511531018 {
	// head dan tail playlist
		static Lagu_2511531018 head_1018 = null;
		static Lagu_2511531018 tail_1018 = null;
		// fungsi menambah lagu di akhir
		public static void tambahLagu_1018(String judul_1018, String penyanyi_1018) {
			// buat node baru
			Lagu_2511531018 laguBaru_1018 = new Lagu_2511531018(judul_1018, penyanyi_1018);
			
			if (head_1018 == null) {
				head_1018 = laguBaru_1018;
				tail_1018 = laguBaru_1018;
			} else {
				// hubungkan pointer next dan prev
				tail_1018.next_1018 = laguBaru_1018;
				laguBaru_1018.prev_1018 = tail_1018;
				tail_1018 = laguBaru_1018;	}
			System.out.println("Lagu berhasil ditambahkan!");
		}
		
		// fungsi menghapus lagu pertama
		public static void hapusLaguAwal_1018() {
			// jika playlist kosong
			if (head_1018 == null) {
				System.out.println("Playlist kosong!");
				return;
			}
			if (head_1018 == tail_1018) {
				head_1018 = null;
				tail_1018 = null;
			} else {
				head_1018 = head_1018.next_1018;
				head_1018.prev_1018 = null;	}
			System.out.println("Lagu pertama berhasil dihapus!");
		}
		
		// fungsi tampil playlist maju
		public static void tampilMaju_1018() {
			// jika playlist kosong
			if (head_1018 == null) {
				System.out.println("Playlist kosong!");
				return;
			}
			// mulai dari head
			Lagu_2511531018 curr_1018 = head_1018;
			System.out.println("=== Playlist Maju ===");
			while (curr_1018 != null) {
				System.out.println("Judul : " + curr_1018.judul_1018 + " | Penyanyi : " + curr_1018.penyanyi_1018);
				// pindah ke node berikutnya
				curr_1018 = curr_1018.next_1018;	}
		}
		
		// fungsi tampil playlist mundur
		public static void tampilMundur_1018() {
			// jika playlist kosong
			if (tail_1018 == null) {
				System.out.println("Playlist kosong!");
				return;
			}
			
			// mulai dari tail
			Lagu_2511531018 curr_1018 = tail_1018;
			System.out.println("=== Playlist Mundur ===");
			while (curr_1018 != null) {
				System.out.println("Judul : " + curr_1018.judul_1018 + " | Penyanyi : " + curr_1018.penyanyi_1018);
						// pindah ke node sebelumnya
						curr_1018 = curr_1018.prev_1018;	}
				}
				
				// fungsi mencari lagu berdasarkan judul
				public static void cariLagu_1018(String judul_1018) {
					// jika playlist kosong
					if (head_1018 == null) {
						System.out.println("Playlist kosong!");
						return;
					}
					
					Lagu_2511531018 curr_1018 = head_1018;
					boolean ditemukan_1018 = false;
					while (curr_1018 != null) {
						// pencarian tidak case-sensitive
						if (curr_1018.judul_1018.equalsIgnoreCase(judul_1018)) {
							System.out.println("Lagu ditemukan!");
							System.out.println("Judul : " + curr_1018.judul_1018);
							System.out.println("Penyanyi : " + curr_1018.penyanyi_1018);
							ditemukan_1018 = true;
							break;	}
						curr_1018 = curr_1018.next_1018;
					}
					
					if (!ditemukan_1018) {
						System.out.println("Lagu tidak ditemukan!");
					}
				}
				
				public static void main(String[] args) {
					Scanner input_1018 = new Scanner(System.in);
					int pilihan_1018;
					
					do {
						System.out.println("\n=== Playlist Musik NIM: 2511531018 ===");
						System.out.println("1. Tambah Lagu");
						System.out.println("2. Hapus Lagu Pertama");
						System.out.println("3. Lihat Playlist (Maju)");
						System.out.println("4. Lihat Playlist (Mundur)");
						System.out.println("5. Cari Lagu");
						System.out.println("6. Keluar");
						System.out.print("Pilihan: ");
						pilihan_1018 = input_1018.nextInt();
						input_1018.nextLine();
						
						switch (pilihan_1018) {
						case 1:
							System.out.print("Judul: ");
							String judul_1018 = input_1018.nextLine();
							
							System.out.print("Penyanyi: ");
							String penyanyi_1018 = input_1018.nextLine();
							
							tambahLagu_1018(judul_1018, penyanyi_1018);
							break;
						case 2:
							hapusLaguAwal_1018();
							break;							
						case 3:
							tampilMaju_1018();
							break;							
						case 4:
							tampilMundur_1018();
							break;							
						case 5:
							System.out.print("Masukkan judul lagu: ");
							String cari_1018 = input_1018.nextLine();							
							cariLagu_1018(cari_1018);
							break;							
						case 6:
							System.out.println("Program selesai.");
							break;							
						default:
							System.out.println("Pilihan tidak valid!");
						}
						 
					} while (pilihan_1018 != 6);
					
					input_1018.close();
				}
}
