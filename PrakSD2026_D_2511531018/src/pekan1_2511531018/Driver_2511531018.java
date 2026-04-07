package src;

public class Driver_2511531018 {
	
	public static void main(String[] args) {

		Mobil_2511531018[] dataMobil = new Mobil_2511531018[10];
	    int jumlah = 0;

	    // TAMBAH MOBIL
        dataMobil[jumlah] = new Mobil_2511531018("Rush", 2018, 1496, 336500000, "Toyota");
	    jumlah++;

	    dataMobil[jumlah] = new Mobil_2511531018("Jazz", 2020, 1497, 250000000, "Honda");
	    jumlah++;

	    // TAMPILKAN
	    System.out.println("Data Mobil:");
	    for (int i = 0; i < jumlah; i++) {
	    	dataMobil[i].tampil();
	    }

	    // HAPUS (index 0)
	    int indexHapus = 0;
	    for (int i = indexHapus; i < jumlah - 1; i++) {
	    	dataMobil[i] = dataMobil[i + 1];
	    }
	    jumlah--;

	    // TAMPILKAN SETELAH HAPUS
	    System.out.println("\nSetelah Hapus:");
	    for (int i = 0; i < jumlah; i++) {
	        dataMobil[i].tampil();
	    }

	    // MUTATOR
	    dataMobil[0].setHarga(480000000);

	    // SELEKTOR
	    System.out.println("\nHarga Mobil Pertama: " + dataMobil[0].getHarga());
	    }
}


