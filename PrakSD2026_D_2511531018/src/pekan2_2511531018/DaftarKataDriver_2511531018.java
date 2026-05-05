package pekan2_2511531018;

public class DaftarKataDriver_2511531018 {
	
	public static void main(String[] args) {
		DaftarKata_2511531018 a1 = new DaftarKata_2511531018();
		
		//Menambah elemen (akhir)
		a1.tambah("Kami");
		a1.tambah("Infomatika");
		
		//Menyisipkan elemen pada indeks 1
		a1.tambahPada(1, "Mahasiswa");
		
		//Cetak isi awal
		System.out.println("Awal         : " + a1);
		
		//Mengubah elemen (index 1)
		a1.ubahElemen(1,  "Departemen");
		System.out.println("Setelah Ubah : " + a1);
		
		//Mengahpus elemen (hapus index 0)
		String terhapus = a1.hapusElemen(0);
		System.out.println("Terhapus     : " + terhapus);
		System.out.println("Setelah Hapus: " + a1);
		
		//Iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi      : ");
		a1.iterasiCetak();
		System.out.println();
	}

}
