package TugasPekan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531018 {
	
		public static void tampilkanMenu_1018() {
			System.out.println("\n=== Playlist Musik NIM: 2511531018 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Lihat Playlist");
			System.out.println("3. Hapus Lagu");
			System.out.println("4. Keluar");
		}
		
		public static void tambahLagu_1018(ArrayList<Musik_2511531018> list, Scanner sc) {
			System.out.print("Masukkan Judul: ");
			String judulLagu_1018= sc.nextLine();
			System.out.print("Masukkan Penyanyi: ");
			String penyanyi_1018 = sc.nextLine();
			System.out.print("Masukkan Durasi: ");
			String durasi_1018 = sc.nextLine();
			list.add(new Musik_2511531018(judulLagu_1018, penyanyi_1018, durasi_1018));
			System.out.println("Data berhasil ditambahkan.");
		}
		
		public static void lihatPlaylist_1018(ArrayList<Musik_2511531018> list) {
			if (list.isEmpty()) {
				System.out.println("Daftar musik kosong.");
			} else {
				System.out.println("Data Musik:");
				for (Musik_2511531018 lagu : list) {
					System.out.println(lagu);
				}
			}
		}
		
		public static void hapusLagu_1018(ArrayList<Musik_2511531018> list, Scanner sc) {
			System.out.print("Masukkan judul yang akan dihapus: ");
			String judulLaguhapus_1018 = sc.nextLine();
			boolean removed = list.removeIf(lagu -> lagu.getJudulLagu_1018().equalsIgnoreCase(judulLaguhapus_1018));
			
			if(removed) {
				System.out.println("Data dengan Judul " + judulLaguhapus_1018 + " berhasil dihapus.");
			} else {
				System.out.println("Judul tidak ditemukan.");
			}
		}
		public static void main(String[] args) {
			ArrayList<Musik_2511531018> musik_1018List = new ArrayList<>();
			Scanner scanner = new Scanner(System.in);
			int choice;
			
			do {
				tampilkanMenu_1018();
				System.out.print("Pilih menu: ");
				choice = scanner.nextInt();
				scanner.nextLine(); 
				
				switch (choice) {
					case 1:
						tambahLagu_1018(musik_1018List, scanner);
						break;
					case 2:
						lihatPlaylist_1018(musik_1018List);
						break;
					case 3:
						hapusLagu_1018(musik_1018List, scanner);
						break;
					case 4:
						System.out.println("Keluar dari program.");
						break;
					default:
						System.out.println("Pilihan tidak valid.");
				}
			}while (choice != 4);
			scanner.close();
							
					
				}
	

}
