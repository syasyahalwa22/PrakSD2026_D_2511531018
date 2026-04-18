package TugasPekan3;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531018 {
	public static void main(String[] args) {
        Stack<Website_2511531018> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== Browser History NIM: 2511531018 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            try {
                pilihan = sc.nextInt();
                sc.nextLine(); 
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                sc.nextLine();
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    // PUSH
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();

                    history.push(new Website_2511531018(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // POP
                    if (!history.isEmpty()) {
                        Website_2511531018 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul_1018());
                    } else {
                        System.out.println("History kosong, tidak bisa kembali!");
                    }
                    break;

                case 3:
                    // PEEK
                    if (!history.isEmpty()) {
                        Website_2511531018 current = history.peek();
                        System.out.println("Halaman saat ini:");
                        System.out.println(current);
                    } else {
                        System.out.println("Tidak ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    // STATUS
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
	
